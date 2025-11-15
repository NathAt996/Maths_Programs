import java.util.Scanner;

public class Spheres {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Select one of the following 3D shapes " +
                "1 = Sphere, 2 = Cylinder, 3 = Cone \n");


        int userShape = userInput.nextInt();


        if (userShape == 1) {

            System.out.println("Enter a radius value");

            double userRadii = sphereVolume(userInput.nextDouble());

            System.out.println("The volume of your sphere is  " +
                    sphereVolume((userRadii))  +
                    " and the surface area of your sphere is " + sphereSurface((userRadii)));
        }


        else if (userShape == 2) {

            System.out.println("Enter a radius value and a height value");

            double userRadius = userInput.nextDouble();
            double userHeight = userInput.nextDouble();

            System.out.println("The volume of your cylinder is  " + cylinderVolume(userRadius, userHeight) +
                    " and the surface area of your cylinder is " + cylinderSurface(userRadius, userHeight));
        }


        else if (userShape == 3) {

            System.out.println("Enter a radius value and a height value");

            double userRadius = userInput.nextDouble();
            double userHeight = userInput.nextDouble();

            System.out.println("The volume of your cone is  " +
                    coneVolume(userRadius, userHeight) +
                    " and the surface area of your cone is " + coneSurface(userRadius, userHeight));
        }


        else {

            System.out.println("You didn't select a shape");
        }
    }


    public static double sphereVolume (double r) {

        return r * r * r * 3.14159 * (4 / 3);
    }


    public static double sphereSurface (double r) {

        return 4 * 3.14159 * r * r;
    }


    public static double cylinderVolume (double r, double h) {

        return 3.14159 * r * r * h;
    }


    public static double cylinderSurface (double r, double h) {

        return 2 * 3.14159 * r * h + 2 * 3.14159 * r * r;
    }


    public static double coneVolume (double r, double h) {

        return 3.14159 * r * r * (h / 3);
    }


    public static double coneSurface (double r, double h) {

        return 3.14159 * r * (r + Math.sqrt(h * 2 + r));

    }
}
