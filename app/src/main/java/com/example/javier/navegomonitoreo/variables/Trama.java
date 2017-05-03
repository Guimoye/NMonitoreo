package com.example.javier.navegomonitoreo.variables;

public interface Trama {
    // Trama Error
    String TRAMA_ERROR = "error";
    String TIPO_EROR = "tipoError";
    String DESCRIPCION = "descripcion";

    String ERROR_CODE = "error_code";
    String ERROR_MESSAGE = "message";
    String SERVICE_ID_EDIT = "servicio_id";
    String PICTURE_DATA = "picture";

    // Trama Usuario
    String TRAMA_USUARIO = "logueado";
    String ID_USUARIO = "idUsuario";
    String USUARIO = "usuario";
    String NOMBRES = "nombres";
    String IDDISPOSITOVO = "idDispositivo";
    String IDCOMPANY = "company_id";
    String PICTURE_COMPANY = "company_picture_url";

    // Tipos de Servicio
    String ID_TIPO_SERVICIO = "id";
    String NOMBRE_TIPO_SERVICIO = "nombre";
    String CONTROL_TIPO_SERVICIO = "app";
    String PERMITS_TIPO_SERVICIO = "p";

    // Lista de Estados
    String ID_ESTADO = "id";
    String DESCRIPCION_ESTADO = "descripcion";
    String COLOR_ESTADO = "color";
    String ON_INBOX = "flag_on_inbox";
    String ORDEN = "orden";
    String NEXTID = "nextid";

    // Motivos
    String ID_MOTIVO = "id";

    // Pois
    String ID_POI = "id_pois";
    String DIRECCION_POI = "direccion";
    String TELEFONO_POI = "telefono";
    String NOMBRE_POI = "nombre";
    String LAT_POI = "lat";
    String LONG_POI = "lng";

    // Colaborador
    String COLABORADOR_DEVICE = "device_id";
    String COLABORADOR_MOVIL = "nombre_movil";
    String COLABORADOR_TIEMPO = "elapsed_time";
    String COLABORADOR_LAT = "latitude";
    String COLABORADOR_LONG = "longitude";

    // Imagenes
    String IMAGE_ID = "id";
    String IMAGE_SERVICE = "servicio_id";
    String IMAGE_DATA = "picture_base64";

    // Gestor Servicio
    String SERVICIO_ID = "id";
    String SERVICIO_IDCASO = "id_numero_caso";
    String SERVICIO_NUMERO_CASO = "numero_caso";
    String SERVICIO_IDESTADO = "estado_servicio_id";
    String SERVICIO_PRIORIDAD = "prioridad";
    String SERVICIO_TIPO_SERVICIO = "tipo_servicio_nombre";
    String SERVICIO_TIPO_SERVICIO_ID = "tipo_servicio_id";

    String SERVICIO_IDMOTORIZADO = "motorizado_id";
    String SERVICIO_FECHA_PROGRAMADA = "fecha_programada";
    String SERVICIO_CLIENTENOMBRE = "cliente_nombre";
    String SERVICIO_CLIENTEAPATERNO = "cliente_apepat";
    String SERVICIO_CLIENTEAMATERNO = "cliente_apemat";
    String SERVICIO_CLIENTEDIRECCION = "cliente_direccion";
    String SERVICIO_CLIENTELATITUD = "cliente_latitud";
    String SERVICIO_CLIENTELONGITUD = "cliente_longitud";
    String SERVICIO_CLIENTETELEFONO = "cliente_telefono";
    String SERVICIO_DEUDAMONTO = "deuda_monto";
    String SERVICIO_DEUDAMONEDA = "deuda_moneda";
    String SERVICIO_PROPUESTAPAGO = "propuesta_pago";
    String SERVICIO_GESTOROBSERVACIONES = "gestor_observaciones";
    String SERVICIO_GESTORRAZONNOPAGO = "gestor_razon_no_pago";
    String SERVICIO_GESTORLUGARCONTACTO = "gestor_lugar_contacto";
    String SERVICIO_GESTORTELEFONO = "gestor_telefono";
    String SERVICIO_GESTORACUERDO = "gestor_acuerdo";
    String SERVICIO_GESTORCORREO = "gestor_correo";

    String FLAGREADONLY = "flag_readonly";
    String FLAGREADMOBILE = "flag_read_mobile";
    String FLAGSYNCMOBILE = "flag_sync_mobile";
    String PICTUREURL = "picture_url";
    String SERVICIO_LINK = "link";
    String SERVICIO_OBSERVACIONES = "cliente_observaciones";
    String NEWRECKEY = "newreckey";
    String FORMTYPE = "form_type";
    String CATEGORIA_ID = "categoria_id";
}
