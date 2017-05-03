package com.example.javier.navegomonitoreo.variables;

public interface Constants {
    // Titulos y labels
    String APP_NAME = "Navego 360+";
    String TAG_NAVEGO = "navego360+";
    String TITULOS_ALERTA = "Navego 360+";

    // Datos del servidor
    int PUERTO_SERVIDOR = 8080;

    //GPS Intervalo tiempos de actualizacion requestLocationUpdates
    int TIEMPOGPS_LATENCIA = 45000;// Milisegundos
    int DISTANCIAGPS = 0;// Metros
    int NODISTANCIAGPS = 0;
    int NOTIEMPOGPS = 0;
    int FRECUENCIA_ENVIO_A_SERVIDOR = 30000;
    int FRECUENCIA_CONSULTA_A_SERVIDOR = 25000;

    // Definicion de tiempos para estrategias de GPS
    int TIEMPOGPS_SINMOVERSE = 60*1000;// Milisegundos
    int DISTANCIAGPS_SINMOVERSE = 0;// Metros

    double TIEMPO_ESPERA_NOMOVERSE = 3*60*1000;

    int TIEMPOGPS_NOAPP = 2*60*1000;// Milisegundos
    int DISTANCIAGPS_NOAPP = 0;// Metros

    int VELOCIDAD_MINIMA = 5;
    int DISTANCIA_MINIMA = 5;

    // Paquetes
    String LOCALIZATION_SERVICES = "com.targetmaps.navego360.newVersion.services.LocalizationServices";
    String ALARM_FOLDER = "android.resource://com.targetmaps.navego360/raw/ping2";
    String PACKAGE_NAME_WAZE = "com.waze";
    String PACKAGE_NAME_GMAPS = "com.google.android.apps.maps";

    String CONFIGURACION_FILTRO = "ServicesFilter";

    // Flag de estados
    String FLAG_ESTADO_GPS_LIBRE   ="000100000000000";
    String FLAG_ESTADO_GPS_OCUPADO ="001000000000000";
    String FLAG_ESTADO_GPS_INOPERATIVO ="000010000000000";

    String FLAG_ESTADO_USUARIO_LOGUEADO    = "1";
    String FLAG_ESTADO_USUARIO_NO_LOGUEADO = "0";

    // Errores
    int RPTA_OK = 1;

    // Caracteres
    String GUION = "-";

    // Opciones de Camara
    String[] PHOTO_OPTIONS = {"De la camara", "De la galeria"};
    int CAMERA_OPTION = 0;
    int GALLERY_OPTION = 1;

    // Coordenadas de Lima
    double LIMA_LATITUDE = -12.0431800;
    double LIMA_LONGITUDE = -77.0282400;

    // Identificador de broadcast
    String INTENT_ALERTA_SERVICIO = "com.targetmaps.navego360.INTENT_ALERTA_SERVICIO";
    String INTENT_UPDATE_SPINNER = "com.targetmaps.navego360.INTENT_UPDATE_SPINNER";
    String INTENT_UPDATE_SERVICE_ID = "com.targetmaps.navego360.INTENT_UPDATE_SERVICE_ID";
    String INTENT_UPDATE_FORM_ID = "com.targetmaps.navego360.INTENT_UPDATE_FORM_ID";

    // COORDENADA INVALIDA
    double NOT_COORDINATE = 10000;

    // Mapa Offline
    double EARTH_RADIUS = 6371009;
    double RADIUS_OFFLINE = 13*1000;

    double MIN_ZOOM = 6;
    double MAX_ZOOM = 14;

    double MAX_TASK = 18;

    String CREDIT_APP_PACKAGE = "com.navego360.credito";

    // Clinica internacional
    int CLINICA_INTER_COMPANY_ID = 132;
    String ESTADO_FINALIZADO_ID = "766";
}
