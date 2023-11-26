import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Equipo
        Equipo equipo1=new Equipo();
        equipo1.setCodigoEquipo("A1010");
        equipo1.setDireccion("Carlos Sastre");
        equipo1.setNombreEquipo("Los Novatos");
        equipo1.setTelefono("620254385");


        //Partido
        Partido partido1=new Partido();
        partido1.setCodigoUnicoPartido("l2025");
        partido1.setEquipoLocal("Los Novatos");
        partido1.setEquipoVisitante("Mandragoras");
        partido1.setFechaPartido("10-05-2024");


        //Jugador_1
        Jugador jugador1=new Jugador();
        jugador1.setDni("70847568B");
        jugador1.setNombre("Carlos");
        jugador1.setApellidos("Ceron Jimenez");
        jugador1.setNumeroCamiseta("12");

        //Jugador_2
        Jugador jugador2=new Jugador();
        jugador2.setDni("7084678Ñ");
        jugador2.setNombre("JhanCarlo");
        jugador2.setApellidos("Benitez Bueno");
        jugador2.setNumeroCamiseta("10");

        //Jugador_3
        Jugador jugador3=new Jugador();
        jugador3.setDni("70847599J");
        jugador3.setNombre("Josue");
        jugador3.setApellidos("Puyol Hernadez");
        jugador3.setNumeroCamiseta("5");



        //Presidente
        Presidente presidente1=new Presidente();
        presidente1.setDni("785000085k");
        presidente1.setNombre("Jhonthan");
        presidente1.setApellidos("Feruel");
        presidente1.setProfesion("Carpintero");



        //Entrenador_1
        Entrenador entrenador1=new Entrenador();
        entrenador1.setDni("89754623L");
        entrenador1.setNombre("Florencio");
        entrenador1.setApellidos("Galiel");
        entrenador1.setFechaNacimiento("07-10-75");


        //Entrenador_2
        Entrenador entrenador2=new Entrenador();
        entrenador2.setDni("89700623J");
        entrenador2.setNombre("Benito");
        entrenador2.setApellidos("Lumen");
        entrenador2.setFechaNacimiento("02-12-79");




    }
        public static void imprimir (Equipo equipo1 ){
        System.out.println("Codigo:" + equipo1.getCodigoEquipo());
        System.out.println("Nombre Del Equipo:" + equipo1.getNombreEquipo());
        System.out.println("Telefono:" + equipo1.getTelefono());
        System.out.println("Direccion:" + equipo1.getDireccion());
        }
        public static void imprimir(Partido partido1){
        System.out.println("Codigo De Partido:"+ partido1.getCodigoUnicoPartido());
        System.out.println("Fecha Del Partido:"+ partido1.getFechaPartido());
        System.out.println("Equipo Local"+ partido1.getEquipoLocal());
        System.out.println("Equipo Visitante"+ partido1.getEquipoVisitante());

        }

        public static void imprimir (Entrenador entrenador1){
        System.out.println("DNI:"+ entrenador1.getDni());
        System.out.println("Nombre:"+ entrenador1.getNombre());
        System.out.println("Apellidos:"+ entrenador1.getApellidos());
        System.out.println("Fecha De Nacimiento:"+ entrenador1.getFechaNacimiento());

        }

        public static void imprimir (Presidente presidente1){
        System.out.println("Dni:"+ presidente1.getDni());
        System.out.println("Nombre:"+ presidente1.getNombre());
        System.out.println("Apellidos:"+ presidente1.getApellidos());
        System.out.println("Profesion:"+ presidente1.getProfesion());

        }
        public static void imprimir(Jugador jugador1){
        System.out.println("DNI:"+ jugador1.getDni());
        System.out.println("Nombre:"+ jugador1.getNombre());
        System.out.println("Apellidos"+ jugador1.getApellidos());
        System.out.println("NUmero De Camiseta"+ jugador1.getNumeroCamiseta());

        }
/*
    public static void imprimir(Jugador jugador2) {
        System.out.println("DNI:" + jugador2.getDni());
        System.out.println("Nombre:" + jugador2.getNombre());
        System.out.println("Apellidos" + jugador2.getApellidos());
        System.out.println("NUmero De Camiseta" + jugador2.getNumeroCamiseta());

    }
    public static void imprimir(Jugador jugador3) {
        System.out.println("DNI:" + jugador3.getDni());
        System.out.println("Nombre:" + jugador3.getNombre());
        System.out.println("Apellidos" + jugador3.getApellidos());
        System.out.println("NUmero De Camiseta" + jugador3.getNumeroCamiseta());

    }*/
        }



