import cs1.Keyboard;

public class PaintCalulator
{
	public static void main(String[] args)
	{
		int doors, windows, length, width, height, surfacearea, openings;

		System.out.print("Length: ");
        length = Keyboard.readInt();
        System.out.print("Width: ");
        width = Keyboard.readInt();
        System.out.print("Height: ");
        height = Keyboard.readInt();

        System.out.print("Numbers of doors: ");
        doors = Keyboard.readInt();
        System.out.print("Numbers of windows: ");
		windows = Keyboard.readInt();

		surfacearea = length * height * 2 + width * height * 2;
		openings = surfacearea - 21 * doors - 12 * windows;

		System.out.println("The surface area is: " + openings);


    }
}