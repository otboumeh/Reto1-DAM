package vendingAdministrator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The main class
 * 
 * @author Khaled, Otmane, Omar
 */
public class Admin {
	/**
	 * Scanner to scan inputs
	 */
	public static Scanner input = new Scanner(System.in);

	/**
	 * Array of User names
	 */
	private static String[] usernames = { "Khaled", "Otmane", "Omar" };
	/**
	 * Array of passwords
	 */
	private static String[] passwords = { "Khaled081", "Otmane122", "Omar007" };

	/**
	 * Matrix of type 1 (refrescos)
	 */
	private static String[][] refrescos = { { "11", "Agua", "1" }, { "12", "Zumo", "1.5" }, { "13", "Cola", "2" },
			{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
			{ null, null, null }, { null, null, null }, { null, null, null } };

	/**
	 * Matrix of type 2 (dulces)
	 */
	private static String[][] dulces = { { "21", "Galletas", "1.7" }, { "22", "Chocolate", "2.5" },
			{ "23", "caramelo", "1" }, { null, null, null }, { null, null, null }, { null, null, null },
			{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null } };

	/**
	 * Matrix of type 3 (bocadillos)
	 */
	private static String[][] bocadillos = { { "31", "Bocadillo de atun", "4" }, { "32", "Bocadillo de pollo", "3.5" },
			{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
			{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null } };

	/**
	 * Matrix of type 4 (snacks)
	 */
	private static String[][] snacks = { { "41", "Cheetos", "3" }, { "42", "Doritos", "3" }, { "43", "Snack day", "2" },
			{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
			{ null, null, null }, { null, null, null }, { null, null, null } };

	/**
	 * This function prints the list of types
	 */
	private static void typesMenu() {
		System.out.println("1- Refrescos");
		System.out.println("2- Dulces");
		System.out.println("3- Bocadillos");
		System.out.println("4- Snacks");
		System.out.println("5- Volver");
	}

	/**
	 * This function calculate the total of all products in every type plus 1
	 * 
	 * @return the total of every product plus 1 (for the return option)
	 */
	private static int listLength() {
		int ret = 0;
		int length = 1;
		for (int i = 0; i < refrescos.length; i++) {
			if (refrescos[i][0] != null) {
				length++;
			}
		}
		for (int i = 0; i < dulces.length; i++) {
			if (dulces[i][0] != null) {
				length++;
			}
		}
		for (int i = 0; i < bocadillos.length; i++) {
			if (bocadillos[i][0] != null) {
				length++;
			}
		}
		for (int i = 0; i < snacks.length; i++) {
			if (snacks[i][0] != null) {
				length++;
			}
		}
		ret = length;
		return ret;
	}

	/**
	 * this function test if the user and password are correct
	 * 
	 * @return its true if they are correct and false if they are not
	 */
	private static boolean userNameAndPasswordChecker() {
		boolean ret = false;
		System.out.println("");
		System.out.println("Inserta tu usuario y password");

		System.out.println("Username: ");
		String username = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();

		for (int i = 0; i < usernames.length; i++) {
			if (username.equalsIgnoreCase(usernames[i]) && password.equals(passwords[i])) {
				ret = true;
				break;
			}
		}
		if (!ret) {
			System.out.println("");
			System.out.println("Erorr: datos Incorrectos!");
			System.out.println("");
		}
		return ret;
	}

	/**
	 * This function prints the main menu
	 */
	private static void inicialMenu() {
		System.out.println("1- Añadir Producto nuevo");
		System.out.println("2- Modificar Producto");
		System.out.println("3- Eliminar Producto");
		System.out.println("4- Salir");
	}

	/**
	 * this function let the user choose one of the options of the menu given to the
	 * function as a parameter
	 * 
	 * @param menuLength    length of the menu
	 * @param displayMethod
	 * @return a numeric value that is equal to the selected option
	 */
	private static int menuSelection(int menuLength, Runnable displayMethod) {
		int ret = 0;
		do {
			try {
				System.out.println();
				System.out.println("** Elige una opcion **");
				System.out.println("-----------------------");
				displayMethod.run();
				ret = input.nextInt();
				input.nextLine();
				if (ret < 1 || ret > menuLength) {
					System.out.println("Error: Opcion Incorrecta! Debe ser entre 1 y " + menuLength + ".");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: Debe ser numerico!");
				input.nextLine();
				ret = 0;
			}
		} while ((ret < 1) || (ret > menuLength));
		return ret;

	}

	/**
	 * this function add a new product to a type list
	 * 
	 * @param type the type in which we want to add our new product
	 */
	private static void ProductEntry(int type) {
		String name = null;
		float priceNumeric = 0;
		String price = null;
		boolean validator = false;
		String[][][] types = { refrescos, dulces, bocadillos, snacks };
		boolean added = false;
		do {
			System.out.println();
			System.out.print("Introduzca el nombre del producto\n");
			System.out.println();
			name = input.nextLine();
			
			if (!Duplicate(name)) {
				validator = true;
			} else {
				System.out.print("Error: este producto ya existe");
			}
		} while (!validator);
		validator = false;

		do {
			try {
				System.out.println();
				System.out.print("Introduzca el precio del producto");
				priceNumeric = input.nextFloat();
				input.nextLine();
				price = String.valueOf(priceNumeric);
				validator = true;
			} catch (Exception e) {
				System.out.println("Error: Debe ser numerico!");
				input.nextLine();
				price = null;
			}
		} while (!validator);

		String[][] selectedType = types[type - 1];

		for (int i = 0; i < selectedType.length; i++) {
			if (selectedType[i][0] == null) {
				int id = (i == 0 || selectedType[i - 1][0] == null) ? Integer.parseInt(type + "1")
						: Integer.parseInt(selectedType[i - 1][0]) + 1;
				selectedType[i][0] = String.valueOf(id);
				selectedType[i][1] = name;
				selectedType[i][2] = price;
				added = true;
				System.out.println("Producto agregado con ID: " + id);
				break;
			}
		}
		if (!added) {
			System.out.println("Error: esta lista esta llena");
		}
	}

	/**
	 * This method prints the list of products of the given type specifying the
	 * starting number for the next type
	 * 
	 * @param list Array of a type given to the method
	 * @param index the starting number of the list
	 * @return the starting number for the next list
	 */
	private static int exploreList(String[][] list, int index) {
		int ret;
		int i;
		for (i = 0; i < list.length; i++) {
			if (list[i][0] != null) {
				System.out.println(index + ")");
				System.out.println("---------------------------");
				System.out.print("ID:          |" + list[i][0] + "\n");
				System.out.println("-------------+-------------");
				System.out.print("Producto:    |" + list[i][1] + "\n");
				System.out.println("-------------+-------------");
				System.out.print("Precio:      |" + list[i][2] + " €\n");
				System.out.println("---------------------------");
				System.out.println();
				index++;
			}
		}
		System.out.print("\n");
		ret = index;
		return ret;
	}

	/**
	 * This function print the list of products
	 */
	private static void showProductList() {
		int index = 1;
		System.out.println("\n----------Refrescos----------\n");

		index = exploreList(refrescos, index);
		System.out.println("\n----------Dulces----------\n");

		index = exploreList(dulces, index);
		System.out.println("\n----------Bocadillos----------\n");
		index = exploreList(bocadillos, index);

		System.out.println("\n----------Snacks----------\n");
		index = exploreList(snacks, index);
		System.out.print(index + ")");
		System.out.println("Volver\n");

	}

	/**
	 * @param type the matrix of a type
	 * @return the total of elements in a given matrix that ara not equal to null
	 */
	private static int usedLengthFinder(String[][] type) {
		int ret = 0;

		for (int i = 0; i < type.length; i++) {
			if (type[i][0] != null) {
				ret++;
			}
		}
		return ret;
	}

	/**
	 * This function returns the number of the type of a given product
	 * 
	 * @param index the number of the selected product
	 * @return the number of the type of a given product
	 */
	private static int typeFinder(int index) {
		int ret = 0;
		int length = usedLengthFinder(refrescos);
		if ((index - length) <= 0) {
			ret = 1;
		} else {
			index -= length;
			length = usedLengthFinder(dulces);
			if ((index - length) <= 0) {
				ret = 2;
			} else {
				index -= length;
				length = usedLengthFinder(bocadillos);
				if ((index - length) <= 0) {
					ret = 3;
				} else {
					index -= length;
					length = usedLengthFinder(snacks);
					if ((index - length) <= 0) {
						ret = 4;
					}
				}
			}
		}
		return ret;
	}

	/**
	 * This function returns the index of the selected product in a given product
	 * 
	 * @param index the number of the selected product
	 * @return the index of the selected product in a given product
	 */
	private static int elementFinder(int index) {
		int ret = 0;
		int length = usedLengthFinder(refrescos);
		if ((index - length) <= 0) {
			ret = index - 1;
		} else {
			index -= length;
			length = usedLengthFinder(dulces);
			if ((index - length) <= 0) {
				ret = index - 1;
			} else {
				index -= length;
				length = usedLengthFinder(bocadillos);
				if ((index - length) <= 0) {
					ret = index - 1;
				} else {
					index -= length;
					length = usedLengthFinder(snacks);
					if ((index - length) <= 0) {
						ret = index - 1;
					}
				}
			}
		}
		return ret;
	}

	/**
	 * This function searches for duplicate names
	 * 
	 * @param newName The name that we are looking for
	 * @return true if exist duplicate and false otherwise
	 */
	private static boolean Duplicate(String newName) {
		newName = newName.trim();
		boolean ret = false;
		for (int i = 0; i < refrescos.length; i++) {
			if (newName.equalsIgnoreCase(refrescos[i][1]) || newName.equalsIgnoreCase(dulces[i][1])
					|| newName.equalsIgnoreCase(bocadillos[i][1]) || newName.equalsIgnoreCase(snacks[i][1])) {
				ret = true;
			}
		}
		return ret;
	}

	/**
	 * This function prints the menu of modification
	 */
	private static void modificationMenu() {
		System.out.println("1- Modificar el nombre del Producto");
		System.out.println("2- Modificar el Precio del Producto");
		System.out.println("3- Modificar el Tipo del producto");
		System.out.println("4- Volver");
	}

	/**
	 * This function modifies the name of the product that is given to it as a
	 * parameter
	 * 
	 * @param SelectedProduct No. of the selected product that is to be modified
	 */
	private static void nameModifier(int SelectedProduct) {
		int type = typeFinder(SelectedProduct);
		int element = elementFinder(SelectedProduct);
		String newName = null;
		boolean validator = false;
		do {
			try {
				System.out.println();
				System.out.println("Introduzca el nombre nuevo");
				newName = input.nextLine();

				if (!Duplicate(newName)) {
					validator = true;
					switch (type) {
					case 1:
						refrescos[element][1] = newName;
						break;
					case 2:
						dulces[element][1] = newName;

						break;
					case 3:
						bocadillos[element][1] = newName;

						break;
					case 4:
						snacks[element][1] = newName;

						break;
					}
				} else {
					System.out.println("Error: este Producto ya existe!");
				}
			} catch (Exception e) {
				System.out.println("Error: Debes introducir solo letras!");
				input.nextLine();
				newName = null;
			}
		} while (!validator);
	}

	/**
	 * This function modifies the Price of a given product to it as a parameter
	 * 
	 * @param SelectedProduct No. of the selected product that is to be modified
	 */
	private static void priceModifier(int SelectedProduct) {
		int type = typeFinder(SelectedProduct);
		int element = elementFinder(SelectedProduct);
		float newPriceNumeric = 0;
		String newPrice = null;
		boolean validData = false;
		do {
			try {
				System.out.println();
				System.out.print("Introduzca el precio nuevo\n");
				newPriceNumeric = input.nextFloat();
				newPrice = String.valueOf(newPriceNumeric);
				validData = true;
				switch (type) {
				case 1:
					refrescos[element][2] = newPrice;
					break;
				case 2:
					dulces[element][2] = newPrice;

					break;
				case 3:
					bocadillos[element][2] = newPrice;

					break;
				case 4:
					snacks[element][2] = newPrice;

					break;
				}
			} catch (Exception e) {
				System.out.println("Error: Debe ser numerico!");
				input.nextLine();
				newPrice = null;
			}
		} while (!validData);

	}

	/**
	 * This method returns and array of type names available for the chosen product
	 * 
	 * @param inicialType the index of the current type of the product
	 * @return the list of available types
	 */
	private static String[] newTypesOptions(int inicialType) {
		String[] ret = new String[3];
		String[] tipos = new String[3];
		switch (inicialType) {
		case 1:
			tipos[0] = "Dulces";
			tipos[1] = "Bocadillos";
			tipos[2] = "Snacks";
			break;
		case 2:
			tipos[0] = "Refrescos";
			tipos[1] = "Bocadillos";
			tipos[2] = "Snacks";
			break;
		case 3:
			tipos[0] = "Refrescos";
			tipos[1] = "Dulces";
			tipos[2] = "Snacks";
			break;
		case 4:
			tipos[0] = "Refrescos";
			tipos[1] = "Dulces";
			tipos[2] = "Bocadillos";
			break;
		}
		ret = tipos;
		return ret;
	}

	/**
	 * This method prints the menu of the available types
	 * 
	 * @param inicialType the current type of the product
	 */
	private static void newTypesMenu(int inicialType) {
		String[] menu = newTypesOptions(inicialType);
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + "- " + menu[i]);
		}
		System.out.println("4- volver");
	}
	
	/**
	 * This function transfers the data of a selected product the a given target type
	 * @param targetList the new Type matrix for the selected product 
	 * @param currentList the current matrix of Types for the selected product 
	 * @param element the index of the the selected product
	 * @param empty the empty space verifier in the tergeList (0 = empty space)
	 */
	private static void addToNewType(String[][] targetList, String[][] currentList, int element, int empty) {
		for (int i = 0; i < targetList.length; i++) {
			if (targetList[i][0] == null) {
				targetList[i][0] = (i == 0 || targetList[i - 1][0] == null) ? "21"
						: String.valueOf(Integer.parseInt(targetList[i - 1][0]) + 1);
				targetList[i][1] = currentList[element][1];
				targetList[i][2] = currentList[element][2];
				break;
			} else {
				empty++;
			}
		}
	}
	
	/**
	 * This method modify the type of the chosen product
	 * 
	 * @param SelectedProduct the index of the selected product to be modified
	 */
	private static void typeModifier(int SelectedProduct) {
		int type = typeFinder(SelectedProduct);
		int element = elementFinder(SelectedProduct);
		int elementToDelete = element;
		int newType = menuSelection(4, () -> newTypesMenu(type));
		int emptySpace = 0;

		switch (type) {
		case 1:
			switch (newType) {
			case 1:
				addToNewType(dulces, refrescos, element, emptySpace);
				break;
			case 2:
				addToNewType(bocadillos, refrescos, element, emptySpace);
				break;
			case 3:
				addToNewType(snacks, refrescos, element, emptySpace);
				break;
			}
			if (emptySpace == 0) {
				System.out.println("Esta lista esta llena");
			} else {
				for (int i = 0; i < refrescos[elementToDelete].length; i++) {
					refrescos[elementToDelete][i] = null;
				}
			}
			break;
		case 2:
			switch (newType) {
			case 1:
				addToNewType(refrescos, dulces, element, emptySpace);
				break;
			case 2:
				addToNewType(bocadillos, dulces, element, emptySpace);
				break;
			case 3:
				addToNewType(snacks, dulces, element, emptySpace);
				break;
			}
			if (emptySpace == 0) {
				System.out.println("Esta lista esta llena");
			} else {
				for (int i = 0; i < dulces[elementToDelete].length; i++) {
					dulces[elementToDelete][i] = null;
				}
			}
			break;

		case 3:
			switch (newType) {
			case 1:
				addToNewType(refrescos, bocadillos, element, emptySpace);
				break;
			case 2:
				addToNewType(dulces, bocadillos, element, emptySpace);
				break;
			case 3:
				addToNewType(snacks, bocadillos, element, emptySpace);
				break;
			}
			if (emptySpace == 0) {
				System.out.println("Esta lista esta llena");
			} else {
				for (int i = 0; i < bocadillos[elementToDelete].length; i++) {
					bocadillos[elementToDelete][i] = null;
				}
			}
			break;
		case 4:
			switch (newType) {
			case 1:
				addToNewType(refrescos, snacks, element, emptySpace);
				break;
			case 2:
				addToNewType(dulces, snacks, element, emptySpace);
				break;
			case 3:
				addToNewType(bocadillos, snacks, element, emptySpace);
				break;
			}
			if (emptySpace == 0) {
				System.out.println("Esta lista esta llena");
			} else {
				for (int i = 0; i < snacks[elementToDelete].length; i++) {
					snacks[elementToDelete][i] = null;
				}
			}
			break;
		}
	}

	/**
	 * This function manages modification options
	 * 
	 * @param selectedData    No. of the selected data type option to be modified
	 * @param selectedProduct No. of the selected product that is to be modified
	 */

	private static void dataModifier(int selectedData, int selectedProduct) {
		switch (selectedData) {
		case 1:
			nameModifier(selectedProduct);
			System.out.println("\nEl nombre del producto ha sido modificado corretmente.");
			break;
		case 2:
			priceModifier(selectedProduct);
			System.out.println("\nEl precio del producto ha sido modificado corretmente.");
			break;
		case 3:
			typeModifier(selectedProduct);
			System.out.println("\nEl tipo del producto ha sido modificado corretmente.");
			break;
		}
	}
	
	/**
	 * This function removes the data of a transfered product from the old type 
	 * @param list the matrix in which the product was located before the transfer
	 * @param element the index of the product 
	 */
	private static void productRemoverFromOneType(String[][] list, int element) {
		String ID = list[element][0];
		list[element][0] = null;
		list[element][1] = null;
		list[element][2] = null;
		System.out.println("Producto con ID " + ID + " se ha eliminado correctamente");
	}

	/**
	 * this method removes the selected product
	 * 
	 * @param SelectedProduct the index of the product selected to be removed
	 */
	private static void removeProduct(int SelectedProduct) {
		int type = typeFinder(SelectedProduct);
		int element = elementFinder(SelectedProduct);
		switch (type) {
		case 1:
			productRemoverFromOneType(refrescos, element);
			break;
		case 2:
			productRemoverFromOneType(dulces, element);
			break;
		case 3:
			productRemoverFromOneType(bocadillos, element);
			break;
		case 4:
			productRemoverFromOneType(snacks, element);
			break;
		}
	}

	/**
	 * the main of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		boolean authentication = false;
		boolean appStart = true;
		while (appStart) {
			do {
				System.out.println("\n-----Bienvenida------");
				authentication = userNameAndPasswordChecker();
			} while (authentication == false);

			boolean start = true;

			while (start) {
				int option = menuSelection(4, Admin::inicialMenu);
				switch (option) {
				case 1:
					int selectedToAdd = menuSelection(5, Admin::typesMenu);
					if (selectedToAdd == 5) {
						break;
					} else {
						ProductEntry(selectedToAdd);
						break;
					}
				case 2:
					int listLength = listLength();
					int selectedToModify = menuSelection(listLength, Admin::showProductList);
					if (selectedToModify == listLength) {
						break;
					} else {
						int dataToBeModefied = menuSelection(4, Admin::modificationMenu);
						dataModifier(dataToBeModefied, selectedToModify);
					}
					break;
				case 3:
					listLength = listLength();
					int selectedToRemove = menuSelection(listLength, Admin::showProductList);
					if (selectedToRemove != listLength) {
						removeProduct(selectedToRemove);
						break;
					} else {
						break;
					}
				case 4:
					start = false;
					authentication = false;
					break;
				}
			}
		}
	}
}