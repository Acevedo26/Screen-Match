public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tiopoPlan = "plus";

        if (fechaDeLanzamiento > 2022){
            System.out.print("Peliculas mas popular");
        } else {
            System.out.print("Peliculas Retro");
        }

        if (incluidoEnElPlan || tiopoPlan.equals("plus")){
            System.out.print("Disfrute");
        } else {
            System.out.print("Pelicula no disponible para el plan");
        }
    }
}
