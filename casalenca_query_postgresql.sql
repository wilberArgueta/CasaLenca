
    DROP TABLE IF EXISTS empleado_venta;
    DROP TABLE IF EXISTS factura_ventas;
    DROP TABLE IF EXISTS factura_compras;
    DROP TABLE IF EXISTS venta_menus;
    DROP TABLE IF EXISTS menu_receta;
    DROP TABLE IF EXISTS proveedor_compra;
    DROP TABLE IF EXISTS compra_productos;
    DROP TABLE IF EXISTS receta_producto;
    DROP TABLE IF EXISTS empleados;
    DROP TABLE IF EXISTS facturas;
    DROP TABLE IF EXISTS ventas;
    DROP TABLE IF EXISTS menus;
    DROP TABLE IF EXISTS recetas;
    DROP TABLE IF EXISTS existencias;
    DROP TABLE IF EXISTS productos;
    DROP TABLE IF EXISTS compras;
    DROP TABLE IF EXISTS proveedores;


    CREATE TABLE proveedores(
        cod_proveedor CHAR(5),
        razon_social VARCHAR(30) NOT NULL,
        nit CHAR(14) NOT NULL,
        telefono CHAR(11) NOT NULL,
        direccion VARCHAR(50) NOT NULL,
        correo VARCHAR(30),
        activo boolean NOT NULL DEFAULT true,
        creado DATETIME NOT NULL DEFAULT GETDATE(),
        actualizado DATETIME NOT NULL DEFAULT GETDATE(),
        eliminado DATE ,
        CONSTRAINT pk_proveedores PRIMARY KEY(cod_proveedor)
    );

    CREATE TABLE compras (
        id_compra IDENTITY(1,1),
        registro_compra CHAR(8) NOT NULL,
        fecha_compra DATETIME NOT NULL DEFAULT GETDATE(),
        detalle VARCHAR(100),
        CONSTRAINT pk_compras PRIMARY KEY(id_compra),
        CONSTRAINT unique_registro_compra UNIQUE(registro_compra)
    );

    CREATE TABLE proveedor_compra(
        id_proveedor_compra IDENTITY(1,1),
        registro_compra CHAR(8) NOT NULL,
        cod_proveedor CHAR(5) NOT NULL,
        CONSTRAINT pk_proveedor_compra PRIMARY KEY (id_proveedor_compra,registro_compra),
        CONSTRAINT fk_PC_compra FOREIGN KEY(registro_compra) REFERENCES compras(registro_compra),
        CONSTRAINT fk_PC_proveedor FOREIGN KEY(cod_proveedor) REFERENCES proveedores(cod_proveedor),
        CONSTRAINT unique_proveedor_compra UNIQUE(cod_proveedor,registro_compra),
        CONSTRAINT unique_proveedor_compra_id_compra UNIQUE(registro_compra)
    );

    CREATE TABLE productos(
        cod_producto CHAR(5),
        nombre VARCHAR(30) NOT NULL,
        activo BOOLEAN NOT NULL DEFAULT true,
        creado DATETIME NOT NULL DEFAULT GETDATE(),
        actualizado DATETIME NOT NULL DEFAULT GETDATE(),
        eliminado DATETIME,
        CONSTRAINT pk_productos PRIMARY KEY(cod_producto),
        CONSTRAINT unique_cod_producto UNIQUE(cod_producto)

    );

    CREATE TABLE compra_productos(
        id_compra_producto IDENTITY(1,1) ,
        registro_compra CHAR(8) NOT NULL,
        cod_producto CHAR(5) NOT NULL,
        cantidad INT NOT NULL,
        CONSTRAINT pk_compra_productos PRIMARY KEY (id_compra_producto),
        CONSTRAINT fk_CP_producto FOREIGN KEY(cod_producto) REFERENCES productos(cod_producto),
        CONSTRAINT fk_CP_compra FOREIGN KEY(id_compra) REFERENCES compras(id_compra),
        CONSTRAINT unique_compra_producto UNIQUE(id_compra,cod_producto)
    );

    CREATE TABLE existencias(
        id_existencia IDENTITY(1,1),
        cantidad INT NOT NULL,
        cod_producto CHAR(5) NOT NULL,
        CONSTRAINT pk_existencias  PRIMARY KEY(id_existencia),
        CONSTRAINT fk_E_producto FOREIGN KEY(cod_producto) REFERENCES productos(cod_producto) ON DELETE CASCADE,
        CONSTRAINT unique_existencias UNIQUE(cod_producto)
    );

    CREATE TABLE recetas(
        id_receta IDENTITY(1,1),
        nombre VARCHAR(30) NOT NULL,
        detalles VARCHAR(100) NOT NULL,
        activa BOOLEAN NOT NULL DEFAULT true,
        creada DATETIME NOT NULL DEFAULT GETDATE(),
        actualizada DATETIME NOT NULL DEFAULT GETDATE(),
        eliminada DATE,
        CONSTRAINT pk_receta PRIMARY KEY(id_receta)
    );

    CREATE TABLE receta_producto(
        id_receta_producto IDENTITY(1,1),
        id_receta INT NOT NULL,
        cod_producto CHAR(5) NOT NULL,
        cantidad int NOT NULL,
        CONSTRAINT pk_receta_producto PRIMARY KEY(id_receta_producto),
        CONSTRAINT unique_receta_producto UNIQUE(id_receta,cod_producto),
        CONSTRAINT fk_RP_receta FOREIGN KEY(id_receta) REFERENCES recetas(id_receta) ON DELETE CASCADE ON UPDATE CASCADE,
        CONSTRAINT fk_RP_producto FOREIGN KEY(cod_producto) REFERENCES productos(cod_producto) ON DELETE CASCADE
    );

    CREATE TABLE menus(
        id_menu IDENTITY(1,1),
        nombre VARCHAR(35) NOT NULL,
        detalles VARCHAR(50),
        precio money NOT NULL,
        activo BOOLEAN NOT NULL DEFAULT true,
        creado DATETIME NOT NULL DEFAULT GETDATE(),
        actualizado DATETIME NOT NULL DEFAULT GETDATE(),
        eliminado DATE,
        CONSTRAINT pk_menus PRIMARY KEY(id_menu) 
    );

    CREATE TABLE menu_receta(
        id_menu_receta IDENTITY(1,1),
        id_receta INT NOT NULL,
        id_menu INT NOT NULL,
        CONSTRAINT pk_menu_receta PRIMARY KEY(id_menu_receta),
        CONSTRAINT fk_MR_receta FOREIGN KEY(id_receta) REFERENCES recetas(id_receta),
        CONSTRAINT fk_MR_menu FOREIGN KEY(id_menu)  REFERENCES menus(id_menu),
        CONSTRAINT unique_menu_receta UNIQUE(id_receta,id_menu)
    );

    CREATE TABLE ventas(
        id_venta IDENTITY(1,1),
        registro_venta CHAR(8) NOT NULL,
        fecha DATETIME NOT NULL DEFAULT GETDATE(),
        detalle VARCHAR(50) NOT NULL,
        CONSTRAINT pk_ventas PRIMARY KEY(id_venta),
        CONSTRAINT unique_registro_venta UNIQUE(registro_venta)
    );


    CREATE TABLE venta_menus(
        id_venta_menu IDENTITY(1,1),
        id_menu INT NOT NULL,
        registro_venta CHAR(8) NOT NULL,
        cantidad INT NOT NULL,
        CONSTRAINT pk_venta_menus PRIMARY KEY(id_venta_menu),
        CONSTRAINT FK_VM_registro_venta FOREIGN KEY(registro_venta) REFERENCES ventas(registro_venta) ON DELETE CASCADE,
        CONSTRAINT unique_ventas_menus UNIQUE(id_menu,registro_venta),
        CONSTRAINT FK_VM_menu_venta FOREIGN KEY(id_menu) REFERENCES menus(id_menu) ON DELETE CASCADE
    );


    CREATE TABLE facturas(
        id_factura IDENTITY(1,1),
        num_factura CHAR(8) NOT NULL,
        correlativo_factura CHAR(10) NOT NULL,
        fecha_factura DATETIME NOT NULL DEFAULT GETDATE(),
        iva INT NOT NULL,
        detalles_f VARCHAR(50) NOT NULL,
        CONSTRAINT pk_facturas PRIMARY KEY(id_factura),
        CONSTRAINT unique_facturas UNIQUE(num_factura,correlativo_factura),
        CONSTRAINT unique_facturas_num_factura UNIQUE(num_factura)
    );

    CREATE TABLE factura_compras(
        id_factura_compra IDENTITY(1,1),
        id_factura INT NOT NULL,
        id_compra INT NOT NULL,
        CONSTRAINT pk_facturas_compras PRIMARY KEY(id_factura_compra),
        CONSTRAINT fk_FC_factura FOREIGN KEY(id_factura) REFERENCES facturas(id_factura),
        CONSTRAINT FK_FC_compra FOREIGN KEY(id_compra) REFERENCES compras(id_compra)

    );

    CREATE TABLE factura_ventas(
        id_factura_venta IDENTITY(1,1),
        id_factura INT NOT NULL,
        id_venta INT NOT NULL,
        CONSTRAINT pk_facturas_ventas PRIMARY KEY(id_factura_venta),
        CONSTRAINT fk_FV_factura FOREIGN KEY(id_factura) REFERENCES facturas(id_factura),
        CONSTRAINT fk_FV_venta FOREIGN KEY(id_venta) REFERENCES ventas(id_venta)
    );




    CREATE TABLE empleados(
        cod_empleado CHAR(5) NOT NULL,
        nombre VARCHAR(20) NOT NULL,
        apellido VARCHAR(20) NOT NULL,
        dui CHAR(11) NOT NULL,
        f_nacimiemto DATE NOT NULL,
        direccion VARCHAR(50) NOT NULL,
        activo BOOLEAN NOT NULL DEFAULT true,
        creado DATETIME NOT NULL DEFAULT GETDATE(),
        actualizado DATETIME NOT NULL DEFAULT GETDATE(),
        eliminado DATE,
        CONSTRAINT pk_empleado PRIMARY KEY(cod_empleado)
    );

    CREATE TABLE empleado_venta(
        id_empleado_venta IDENTITY(1,1),
        id_venta INT NOT NULL,
        cod_empleado CHAR(5) NOT NULL,
        CONSTRAINT pk_empleado_venta PRIMARY KEY(id_empleado_venta),
        CONSTRAINT fk_EV_venta FOREIGN KEY(id_venta) REFERENCES ventas(id_venta),
        CONSTRAINT fk_EV_empleado FOREIGN KEY(cod_empleado) REFERENCES empleados(cod_empleado)
    );





