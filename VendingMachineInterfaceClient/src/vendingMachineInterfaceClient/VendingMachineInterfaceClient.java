package vendingMachineInterfaceClient;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * our main function to run the program
 */
public class VendingMachineInterfaceClient extends JFrame {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	/**
	 * The main Panel
	 */
	private JPanel contentPane;
	/**
	 * Array of images that we used in the program
	 */
	public ImageIcon[] imagenes = new ImageIcon[50];
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductUno1;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductoDos1;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductotres1;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductocuatro1;
	/**
	 * index that count cuantity of Cocacola
	 */
	private int countCocaCola = 0;
	/**
	 * index that count cuantity of Sprite
	 */
	private int SpriteCount = 0;
	/**
	 * index that count cuantity of Nestea
	 */
	private int NesteaCount = 0;
	/**
	 * index that count cuantity of Fanta
	 */
	private int FantaCount = 0;
	/**
	 * index that count cuantity of Lays
	 */
	private int countLays = 0;
	/**
	 * index that count cuantity of Pringles
	 */
	private int PringlesCount = 0;
	/**
	 * index that count cuantity of Cheetos
	 */
	private int CheetosCount = 0;
	/**
	 * index that count cuantity of Snickers
	 */
	private int SnickersCount = 0;
	/**
	 * index that count cuantity of cARAMEL
	 */
	private int countCaramel = 0;
	/**
	 * index that count cuantity of Harribo
	 */
	private int countHarribo = 0;
	/**
	 * index that count cuantity of Milka
	 */
	private int countMilka = 0;
	/**
	 * index that count cuantity of Kinder
	 */
	private int countKinder = 0;
	/**
	 * index that count cuantity of Queso
	 */
	private int countQueso = 0;
	/**
	 * index that count cuantity of Crab
	 */
	private int countCrab = 0;
	/**
	 * index that count cuantity of Atun
	 */
	private int countAtun = 0;
	/**
	 * index that count cuantity of Mermelada
	 */
	private int countMarmelada = 0;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductUno2;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductoDos2;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductotres2;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductocuatro2;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductUno3;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductoDos3;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductotres3;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductocuatro3;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductUno4;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductoDos4;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductotres4;
	/**
	 * The field to put image of a product
	 */
	private JTextField textFieldProductocuatro4;
	/**
	 * The field to put image of a product
	 */
	private JTextField textResult1;
	/**
	 * Text field for the display of the money introduced
	 */
	private JTextField textField = new JTextField();

	/**
	 * Panel for the type Refresocos
	 */
	private JPanel TipoRefrescos = new JPanel();
	/**
	 * Panel for the type Snacks
	 */
	private JPanel TipoSnacks = new JPanel();
	/**
	 * Panel for the type Sandwitch
	 */
	private JPanel TipoSandwitch = new JPanel();
	/**
	 * Panel for the type Dulce
	 */
	private JPanel TipoDulces = new JPanel();
	/**
	 * Panel for the pay interface
	 */
	private JPanel PanelPagar = new JPanel();
	/**
	 * Panel for the summary interface
	 */
	private JPanel PanelFinalizar = new JPanel();
	/**
	 * The welcome panel
	 */
	private JPanel PanelBienvenida = new JPanel();

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachineInterfaceClient frame = new VendingMachineInterfaceClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * table of cart to put it inside of the type Refrescos
	 */
	private DefaultTableModel modeloRefrescos = createNonEditableTableModel();
	/**
	 * table of cart to put it inside of the type Dulces
	 */
	private DefaultTableModel modeloDulces = createNonEditableTableModel();
	/**
	 * table of cart to put it inside of the type Snacks
	 */
	private DefaultTableModel modeloSnacks = createNonEditableTableModel();
	/**
	 * table of cart to put it inside of the type Sandwitch
	 */
	private DefaultTableModel modeloSandwitch = createNonEditableTableModel();
	/**
	 * table of the summary of the buying process
	 */
	private DefaultTableModel modeloFinalizar = createNonEditableTableModel();
	/**
	 * a text field to print the change when we finish the buying process
	 */
	private JTextArea textFieldFinish;

	/**
	 * A function to make the cells of the table not modificable
	 * 
	 * @return Make all cells non-editable
	 */
	private DefaultTableModel createNonEditableTableModel() {
		return new DefaultTableModel() {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

	/**
	 * a function to put all images used in the program
	 */
	private void PutImg() {

		imagenes[0] = new ImageIcon(this.getClass().getResource("0.jpg"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("Bocadillos.jpg"));
		imagenes[2] = new ImageIcon(this.getClass().getResource("Dulces.jpg"));
		imagenes[3] = new ImageIcon(this.getClass().getResource("Refrescos.jpg"));
		imagenes[4] = new ImageIcon(this.getClass().getResource("Snacks.jpg"));
		imagenes[5] = new ImageIcon(this.getClass().getResource("atun.jpg"));
		imagenes[6] = new ImageIcon(this.getClass().getResource("queso.jpg"));
		imagenes[7] = new ImageIcon(this.getClass().getResource("mermelada.jpg"));
		imagenes[8] = new ImageIcon(this.getClass().getResource("crab.jpg"));
		imagenes[9] = new ImageIcon(this.getClass().getResource("lata-coca-cola.jpg"));
		imagenes[10] = new ImageIcon(this.getClass().getResource("fanta.jpg"));
		imagenes[11] = new ImageIcon(this.getClass().getResource("nestea.jpg"));
		imagenes[12] = new ImageIcon(this.getClass().getResource("Sprite.jpg"));
		imagenes[13] = new ImageIcon(this.getClass().getResource("lay_s.jpg"));
		imagenes[14] = new ImageIcon(this.getClass().getResource("cheetos.png"));
		imagenes[15] = new ImageIcon(this.getClass().getResource("Pringles.jpg"));
		imagenes[16] = new ImageIcon(this.getClass().getResource("snickers.jpg"));
		imagenes[17] = new ImageIcon(this.getClass().getResource("caramels.jpg"));
		imagenes[18] = new ImageIcon(this.getClass().getResource("haribo.jpg"));
		imagenes[19] = new ImageIcon(this.getClass().getResource("milka.jpg"));
		imagenes[20] = new ImageIcon(this.getClass().getResource("kinder.png"));
	}

	/**
	 * a function to change to the Refresco Panel
	 */
	private void ChangePanelRefresco() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoRefresco");
	}
	
	/**
	 * This function resizes the size of a given image to new a height and width
	 * @param original the image for resizing 
	 * @param width the new width for the given image
	 * @param height the new height for the given image
	 * @return this function returns an image with new given dimensions 
	 */
	private ImageIcon resizeImage(ImageIcon original, int width, int height) {
		Image originalImage = original.getImage();
		Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(resizedImage);
	}

	/**
	 * a function to change to the Bocadillos Panel
	 */
	private void ChangePanelSandwitch() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoSandwitch");
	}

	/**
	 * a function to change to the Dulces Panel
	 */
	private void ChangePanelDulce() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoDulces");
	}

	/**
	 * a function to change to the Snack Panel
	 */
	private void ChangePanelSnack() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoSnacks");
	}

	/**
	 * a function to change to the summary Panel
	 */
	private void FinalizarCompra() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "Finalizar");
	}

	/**
	 * a function to change to the types Panel
	 */
	private void ChangePanelTipo() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "Tipos");
	}

	/**
	 * a function to verify the existence of elements in the table modeloDulces so
	 * it will enable or disable the button "FINALIZAR COMPRA"
	 * 
	 * @param button the button FINALIZAR COMPRA
	 * @return Enable button if table has items or Disable button if table is empty
	 */
	private int updateFinalizarButtonState(JButton button) {
		if (modeloDulces.getRowCount() == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	/**
	 * a function to add product, increase and decrease price in the correspondent
	 * table.
	 * 
	 * @param tableModel     the table that we want to modify
	 * @param productName    the name of the product that we want to add or modify
	 * @param productPrice   the price of the product that we want to add or modify
	 * @param priceIncrement the valor of increase of decrease the product price
	 */
	private void ButtonHandler(DefaultTableModel tableModel, String productName, String productPrice,
			double priceIncrement) {
		boolean productExists = false;

		// Check if the product already exists in the table
		for (int rowIndex = 0; rowIndex < tableModel.getRowCount(); rowIndex++) {
			String product = (String) tableModel.getValueAt(rowIndex, 0); // Column 0 for product name
			if (product.equals(productName)) {
				productExists = true;

				String currentPriceStr = (String) tableModel.getValueAt(rowIndex, 1); // Get the current price from the
																						// table (Column 1 for price)
				currentPriceStr = currentPriceStr.replace(",", "."); // Replace comma with dot to ensure correct parsing

				double currentPrice = Double.parseDouble(currentPriceStr); // Parse the string into a double

				currentPrice += priceIncrement; // Increment by the specified amount
				tableModel.setValueAt(String.format("%.2f", currentPrice), rowIndex, 1); // Update the table model with
																							// the new price (format as
																							// 2 decimal places)

				break; // Exit loop once the row is found and updated
			}
		}
		// If the product does not exist, add it to the table
		if (!productExists) {
			// Use the provided productPrice as the initial price for the new product
			tableModel.addRow(new Object[] { productName, String.format("%.2f", Double.parseDouble(productPrice)) });
		}
	}

	/**
	 * delete all the tables of the types .
	 */
	private void BorrarTodo() {
		textFieldProductUno1.setText("");
		textFieldProductUno2.setText("");
		textFieldProductUno3.setText("");
		textFieldProductUno4.setText("");
		textFieldProductoDos1.setText("");
		textFieldProductoDos2.setText("");
		textFieldProductoDos3.setText("");
		textFieldProductoDos4.setText("");
		textFieldProductotres1.setText("");
		textFieldProductotres2.setText("");
		textFieldProductotres3.setText("");
		textFieldProductotres4.setText("");
		textFieldProductocuatro1.setText("");
		textFieldProductocuatro2.setText("");
		textFieldProductocuatro3.setText("");
		textFieldProductocuatro4.setText("");
		textField.setText("");
		textResult1.setText("");
		modeloRefrescos.setRowCount(0);
		modeloDulces.setRowCount(0);
		modeloSnacks.setRowCount(0);
		modeloSandwitch.setRowCount(0);
		modeloFinalizar.setRowCount(0);
		countCocaCola = 0;
		SpriteCount = 0;
		NesteaCount = 0;
		FantaCount = 0;
		countLays = 0;
		PringlesCount = 0;
		CheetosCount = 0;
		SnickersCount = 0;
		countCaramel = 0;
		countHarribo = 0;
		countMilka = 0;
		countKinder = 0;
		countQueso = 0;
		countCrab = 0;
		countAtun = 0;
		countMarmelada = 0;
	}

	/**
	 * this function put the product and prices in the table of summary
	 * 
	 * @param modeloFinalizar the table of summary
	 * @param productName     the name of the product
	 * @param productPrice    the price of product
	 * @param productCantidad the quantity of the product
	 * @param priceIncrement  the value of the modification of the price
	 */
	private void ButtonFinalizarHandler(DefaultTableModel modeloFinalizar, String productName, String productPrice,
			int productCantidad, double priceIncrement) {
		boolean productExists = false;
		double precioBase = Double.parseDouble(productPrice);
		// Calcular el precio con IVA
		double precioConIVA = precioBase * 1.21 * productCantidad;
		// Verificar si el producto ya existe en la tabla
		for (int rowIndex = 0; rowIndex < modeloFinalizar.getRowCount(); rowIndex++) {
			String product = (String) modeloFinalizar.getValueAt(rowIndex, 0); // Nombre en la columna 0
			if (product.equals(productName)) {
				productExists = true;
				// Actualizar la cantidad y recalcular el precio total con IVA
				modeloFinalizar.setValueAt(productCantidad, rowIndex, 1); // Establecer la nueva cantidad
				modeloFinalizar.setValueAt(String.format("%.2f", precioBase * productCantidad), rowIndex, 2);
				modeloFinalizar.setValueAt(String.format("%.2f", precioConIVA), rowIndex, 3);
				break;
			}
		}

		// Si el producto no existe, agregarlo a la tabla
		if (!productExists) {
			modeloFinalizar.addRow(new Object[] { productName, productCantidad, String.format("%.2f", precioBase),
					String.format("%.2f", precioConIVA) });
		}
	}

	/**
	 * a function that remove the product from the correspondent table
	 * 
	 * @param tableModel  the table that we want to remove from the product
	 * @param productName the name of the product that we want to remove
	 */
	private void removeProductFromTable(DefaultTableModel tableModel, String productName) {
		for (int rowIndex = tableModel.getRowCount() - 1; rowIndex >= 0; rowIndex--) {
			String product = (String) tableModel.getValueAt(rowIndex, 0); // Column 0 for product name
			if (product.equalsIgnoreCase(productName)) { // Case-insensitive comparison
				tableModel.removeRow(rowIndex); // Remove the row
			}
		}
	}

	/**
	 * a function that manage the panel of refrescos
	 */
	private void RefrescosHandler() {

		contentPane.add(TipoRefrescos, "TipoRefresco");
		TipoRefrescos.setLayout(null);
		JButton BtnMenosproductoUno1 = new JButton("-");
		JButton BtnplusProductoCuatro1 = new JButton("+");
		JButton BtnVolverRef = new JButton("Volver");
		JButton BtnMenosproductoDos1 = new JButton("-");
		JButton BtnplusProductoDos1 = new JButton("+");
		JButton BtnplusProductoTres1 = new JButton("+");
		JButton BtnplusProductoUno1 = new JButton("+");
		JButton BtnMenosproductoTres1 = new JButton("-");
		JButton BtnMenosproductoCuatro1 = new JButton("-");
		JButton BtnFinalizarR = new JButton("Finalizar Compra");

		BtnMenosproductoUno1.setBounds(10, 426, 45, 23);
		BtnplusProductoUno1.setBounds(102, 426, 45, 23);
		BtnVolverRef.setBounds(10, 484, 137, 33);
		BtnMenosproductoTres1.setBounds(370, 426, 45, 23);
		BtnMenosproductoDos1.setBounds(190, 426, 45, 23);
		BtnplusProductoTres1.setBounds(462, 426, 45, 23);
		BtnMenosproductoCuatro1.setBounds(550, 426, 45, 23);
		BtnplusProductoCuatro1.setBounds(642, 426, 45, 23);
		BtnplusProductoDos1.setBounds(282, 426, 45, 23);
		BtnFinalizarR.setBounds(769, 484, 150, 33);

		TipoRefrescos.add(BtnMenosproductoUno1);
		TipoRefrescos.add(BtnplusProductoUno1);
		TipoRefrescos.add(BtnVolverRef);
		TipoRefrescos.add(BtnMenosproductoDos1);
		TipoRefrescos.add(BtnplusProductoDos1);
		TipoRefrescos.add(BtnMenosproductoTres1);
		TipoRefrescos.add(BtnplusProductoCuatro1);
		TipoRefrescos.add(BtnplusProductoTres1);
		TipoRefrescos.add(BtnMenosproductoCuatro1);
		TipoRefrescos.add(BtnFinalizarR);
		textFieldProductUno1 = new JTextField();
		textFieldProductUno1.setBounds(58, 427, 40, 21);
		textFieldProductUno1.setText(Integer.toString(countCocaCola)); // Converts countCocacola to String
		textFieldProductUno1.setEditable(false);
		TipoRefrescos.add(textFieldProductUno1);
		textFieldProductUno1.setColumns(10);

		textFieldProductoDos1 = new JTextField();
		textFieldProductoDos1.setText(Integer.toString(SpriteCount));
		textFieldProductoDos1.setEditable(false);
		textFieldProductoDos1.setColumns(10);
		textFieldProductoDos1.setBounds(238, 427, 40, 21);
		TipoRefrescos.add(textFieldProductoDos1);

		textFieldProductotres1 = new JTextField();
		textFieldProductotres1.setText(Integer.toString(NesteaCount));
		textFieldProductotres1.setEditable(false);
		textFieldProductotres1.setColumns(10);
		textFieldProductotres1.setBounds(418, 427, 40, 21);
		TipoRefrescos.add(textFieldProductotres1);

		textFieldProductocuatro1 = new JTextField();
		textFieldProductocuatro1.setText(Integer.toString(FantaCount));
		textFieldProductocuatro1.setEditable(false);
		textFieldProductocuatro1.setColumns(10);
		textFieldProductocuatro1.setBounds(598, 427, 40, 21);
		TipoRefrescos.add(textFieldProductocuatro1);

		BtnVolverRef.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelTipo();
			}
		});
		BtnFinalizarR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (updateFinalizarButtonState(BtnFinalizarR) == 1) {

					FinalizarCompra();
				}
			}
		});

		BtnplusProductoUno1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countCocaCola++; // Increment the count
				textFieldProductUno1.setText(Integer.toString(countCocaCola)); // Update the text field
				ButtonHandler(modeloRefrescos, "Coca-Cola", "1.00", 1.00);
				ButtonHandler(modeloSnacks, "Coca-Cola", "1.00", 1.00);
				ButtonHandler(modeloSandwitch, "Coca-Cola", "1.00", 1.00);
				ButtonHandler(modeloDulces, "Coca-Cola", "1.00", 1.00);// Call the handler
				ButtonFinalizarHandler(modeloFinalizar, "Coca-Cola", "1.00", countCocaCola, 1.00);
			}
		});
		BtnMenosproductoUno1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Only decrement if countCocaCola is greater than 0
				if (countCocaCola > 0) {
					countCocaCola--; // Decrement the count
					textFieldProductUno1.setText(Integer.toString(countCocaCola)); // Update the text field
					if (countCocaCola == 0) {
						removeProductFromTable(modeloRefrescos, "Coca-Cola");
						removeProductFromTable(modeloSandwitch, "Coca-Cola");
						removeProductFromTable(modeloDulces, "Coca-Cola");
						removeProductFromTable(modeloSnacks, "Coca-Cola");// Call the remove method
						removeProductFromTable(modeloFinalizar, "Coca-Cola");
					} else {
						ButtonHandler(modeloRefrescos, "Coca-Cola", "1.00", -1.00);
						ButtonHandler(modeloSandwitch, "Coca-Cola", "1.00", -1.00);
						ButtonHandler(modeloDulces, "Coca-Cola", "1.00", -1.00);
						ButtonHandler(modeloSnacks, "Coca-Cola", "1.00", -1.00);
						ButtonFinalizarHandler(modeloFinalizar, "Coca-Cola", "1.00", countCocaCola, -1.00);

					}
				}
			}
		});
		BtnplusProductoDos1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SpriteCount++;
				textFieldProductoDos1.setText(Integer.toString(SpriteCount));
				ButtonHandler(modeloRefrescos, "Sprite", "1.05", 1.05); // Call the handler
				ButtonHandler(modeloSandwitch, "Sprite", "1.05", 1.05);
				ButtonHandler(modeloDulces, "Sprite", "1.05", 1.05);
				ButtonHandler(modeloSnacks, "Sprite", "1.05", 1.05);
				ButtonFinalizarHandler(modeloFinalizar, "Sprite", "1.05", SpriteCount, 1.05);

			}
		});
		BtnMenosproductoDos1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SpriteCount > 0) {
					SpriteCount--;
					textFieldProductoDos1.setText(Integer.toString(SpriteCount));
					if (SpriteCount == 0) {
						removeProductFromTable(modeloRefrescos, "Sprite"); // Call the remove method
						removeProductFromTable(modeloSnacks, "Sprite");
						removeProductFromTable(modeloDulces, "Sprite");
						removeProductFromTable(modeloSandwitch, "Sprite");
						removeProductFromTable(modeloFinalizar, "Sprite");

					} else {
						ButtonHandler(modeloRefrescos, "Sprite", "1.05", -1.05); // Update price
						ButtonHandler(modeloSandwitch, "Sprite", "1.05", -1.05);
						ButtonHandler(modeloDulces, "Sprite", "1.05", -1.05);
						ButtonHandler(modeloSnacks, "Sprite", "1.05", -1.05);
						ButtonFinalizarHandler(modeloFinalizar, "Sprite", "1.05", SpriteCount, -1.05);
					}
				}
			}
		});
		BtnplusProductoTres1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NesteaCount++;
				textFieldProductotres1.setText(Integer.toString(NesteaCount));
				ButtonHandler(modeloRefrescos, "Nestea", "1.20", 1.20);
				ButtonHandler(modeloSnacks, "Nestea", "1.20", 1.20);
				ButtonHandler(modeloDulces, "Nestea", "1.20", 1.20);
				ButtonHandler(modeloSandwitch, "Nestea", "1.20", 1.20);
				ButtonFinalizarHandler(modeloFinalizar, "Nestea", "1.20", NesteaCount, 1.20);
			}
		});
		BtnMenosproductoTres1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (NesteaCount > 0) {
					NesteaCount--;
					textFieldProductotres1.setText(Integer.toString(NesteaCount));
					if (NesteaCount == 0) {
						removeProductFromTable(modeloRefrescos, "Nestea");
						removeProductFromTable(modeloSandwitch, "Nestea");
						removeProductFromTable(modeloSnacks, "Nestea");
						removeProductFromTable(modeloDulces, "Nestea");
						removeProductFromTable(modeloFinalizar, "Nestea");

					} else {
						ButtonHandler(modeloRefrescos, "Nestea", "1.20", -1.20);
						ButtonHandler(modeloSnacks, "Nestea", "1.20", -1.20);
						ButtonHandler(modeloDulces, "Nestea", "1.20", -1.20);
						ButtonHandler(modeloSandwitch, "Nestea", "1.20", -1.20);
						ButtonFinalizarHandler(modeloFinalizar, "Nestea", "1.20", NesteaCount, -1.20);
					}
				}
			}
		});

		BtnplusProductoCuatro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FantaCount++;
				textFieldProductocuatro1.setText(Integer.toString(FantaCount));
				ButtonHandler(modeloRefrescos, "Fanta", "0.95", 0.95);
				ButtonHandler(modeloSnacks, "Fanta", "0.95", 0.95);
				ButtonHandler(modeloDulces, "Fanta", "0.95", 0.95);
				ButtonHandler(modeloSandwitch, "Fanta", "0.95", 0.95);
				ButtonFinalizarHandler(modeloFinalizar, "Fanta", "0.95", FantaCount, 0.95);

			}
		});
		BtnMenosproductoCuatro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (FantaCount > 0) {
					FantaCount--;
					textFieldProductocuatro1.setText(Integer.toString(FantaCount));
					if (FantaCount == 0) {
						removeProductFromTable(modeloRefrescos, "Fanta");
						removeProductFromTable(modeloSnacks, "Fanta");
						removeProductFromTable(modeloDulces, "Fanta");
						removeProductFromTable(modeloSandwitch, "Fanta");
						removeProductFromTable(modeloFinalizar, "Fanta");

					} else {
						ButtonHandler(modeloRefrescos, "Fanta", "0.95", -0.95);
						ButtonHandler(modeloSnacks, "Fanta", "0.95", -0.95);
						ButtonHandler(modeloDulces, "Fanta", "0.95", -0.95);
						ButtonHandler(modeloSandwitch, "Fanta", "0.95", -0.95);
						ButtonFinalizarHandler(modeloFinalizar, "Fanta", "0.95", FantaCount, -0.95);
					}
				}
			}
		});
		JLabel LabelCoca = new JLabel("New label");
		LabelCoca.setBounds(10, 35, 137, 339);
		TipoRefrescos.add(LabelCoca);
		imagenes[9] = 	imagenes[9] = resizeImage(imagenes[9], LabelCoca.getWidth(), LabelCoca.getHeight());
		LabelCoca.setIcon(imagenes[9]);

		JLabel LabelSprite = new JLabel("New label");
		LabelSprite.setBounds(190, 35, 137, 339);
		TipoRefrescos.add(LabelSprite);
		imagenes[12] = 	imagenes[12] = resizeImage(imagenes[12], LabelSprite.getWidth(), LabelSprite.getHeight());
		LabelSprite.setIcon(imagenes[12]);

		JLabel LabelNestea = new JLabel("New label");
		LabelNestea.setBounds(370, 35, 137, 339);
		TipoRefrescos.add(LabelNestea);
		imagenes[11] = 	imagenes[11] = resizeImage(imagenes[11], LabelNestea.getWidth(), LabelNestea.getHeight());
		LabelNestea.setIcon(imagenes[11]);

		JLabel LabelFanta = new JLabel("New label");
		LabelFanta.setBounds(550, 35, 137, 339);
		TipoRefrescos.add(LabelFanta);
		imagenes[10] = 	imagenes[10] = resizeImage(imagenes[10], LabelFanta.getWidth(), LabelFanta.getHeight());
		LabelFanta.setIcon(imagenes[10]);
	}

	/**
	 * a function that manage the panel of Snack
	 */
	private void SnackHandler() {
		contentPane.add(TipoSnacks, "TipoSnacks");
		TipoSnacks.setLayout(null);
		JButton BtnMenosproductoUno2 = new JButton("-");
		JButton BtnplusProductoCuatro2 = new JButton("+");
		JButton BtnVolverSna = new JButton("Volver");
		JButton BtnMenosproductoDos2 = new JButton("-");
		JButton BtnplusProductoDos2 = new JButton("+");
		JButton BtnplusProductoTres2 = new JButton("+");
		JButton BtnplusProductoUno2 = new JButton("+");
		JButton BtnMenosproductoTres2 = new JButton("-");
		JButton BtnMenosproductoCuatro2 = new JButton("-");
		JButton BtnFinalizarS = new JButton("Finalizar Compra");

		BtnMenosproductoUno2.setBounds(10, 426, 45, 23);
		BtnplusProductoUno2.setBounds(102, 426, 45, 23);
		BtnVolverSna.setBounds(10, 484, 137, 33);
		BtnMenosproductoTres2.setBounds(370, 426, 45, 23);
		BtnMenosproductoDos2.setBounds(190, 426, 45, 23);
		BtnplusProductoTres2.setBounds(462, 426, 45, 23);
		BtnMenosproductoCuatro2.setBounds(550, 426, 45, 23);
		BtnplusProductoCuatro2.setBounds(642, 426, 45, 23);
		BtnplusProductoDos2.setBounds(282, 426, 45, 23);
		BtnFinalizarS.setBounds(769, 484, 150, 33);

		TipoSnacks.add(BtnMenosproductoUno2);
		TipoSnacks.add(BtnplusProductoUno2);
		TipoSnacks.add(BtnVolverSna);
		TipoSnacks.add(BtnMenosproductoDos2);
		TipoSnacks.add(BtnplusProductoDos2);
		TipoSnacks.add(BtnMenosproductoTres2);
		TipoSnacks.add(BtnplusProductoCuatro2);
		TipoSnacks.add(BtnplusProductoTres2);
		TipoSnacks.add(BtnMenosproductoCuatro2);
		TipoSnacks.add(BtnFinalizarS);
		textFieldProductUno2 = new JTextField();
		textFieldProductUno2.setBounds(58, 427, 40, 21);
		textFieldProductUno2.setText(Integer.toString(countLays));
		textFieldProductUno2.setEditable(false);
		TipoSnacks.add(textFieldProductUno2);
		textFieldProductUno2.setColumns(10);

		textFieldProductoDos2 = new JTextField();
		textFieldProductoDos2.setText(Integer.toString(PringlesCount));
		textFieldProductoDos2.setEditable(false);
		textFieldProductoDos2.setColumns(10);
		textFieldProductoDos2.setBounds(238, 427, 40, 21);
		TipoSnacks.add(textFieldProductoDos2);

		textFieldProductotres2 = new JTextField();
		textFieldProductotres2.setText(Integer.toString(CheetosCount));
		textFieldProductotres2.setEditable(false);
		textFieldProductotres2.setColumns(10);
		textFieldProductotres2.setBounds(418, 427, 40, 21);
		TipoSnacks.add(textFieldProductotres2);

		textFieldProductocuatro2 = new JTextField();
		textFieldProductocuatro2.setText(Integer.toString(SnickersCount));
		textFieldProductocuatro2.setEditable(false);
		textFieldProductocuatro2.setColumns(10);
		textFieldProductocuatro2.setBounds(598, 427, 40, 21);
		TipoSnacks.add(textFieldProductocuatro2);

		BtnVolverSna.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelTipo();

			}
		});
		BtnFinalizarS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (updateFinalizarButtonState(BtnFinalizarS) == 1) {
					FinalizarCompra();
				}
			}
		});

		BtnplusProductoUno2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countLays++; // Increment the count
				textFieldProductUno2.setText(Integer.toString(countLays)); // Update the text field
				ButtonHandler(modeloRefrescos, "Lays", "1.25", 1.25);
				ButtonHandler(modeloSnacks, "Lays", "1.25", 1.25);
				ButtonHandler(modeloSandwitch, "Lays", "1.25", 1.25);
				ButtonHandler(modeloDulces, "Lays", "1.25", 1.25);// Call the handler
				ButtonFinalizarHandler(modeloFinalizar, "Lays", "1.25", countLays, 1.25);
			}
		});
		BtnMenosproductoUno2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Only decrement if countLays is greater than 0
				if (countLays > 0) {
					countLays--; // Decrement the count
					textFieldProductUno2.setText(Integer.toString(countLays)); // Update the text field

					if (countLays == 0) {
						removeProductFromTable(modeloRefrescos, "Lays");
						removeProductFromTable(modeloSandwitch, "Lays");
						removeProductFromTable(modeloDulces, "Lays");
						removeProductFromTable(modeloSnacks, "Lays");// Call the remove method
						removeProductFromTable(modeloFinalizar, "Lays");
					} else {
						ButtonHandler(modeloRefrescos, "Lays", "1.25", -1.25);
						ButtonHandler(modeloSandwitch, "Lays", "1.25", -1.25);
						ButtonHandler(modeloDulces, "Lays", "1.25", -1.25);
						ButtonHandler(modeloSnacks, "Lays", "1.25", -1.25);
						ButtonFinalizarHandler(modeloFinalizar, "Lays", "1.25", countLays, -1.25);
					}
				}
			}
		});

		BtnplusProductoDos2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				PringlesCount++;
				textFieldProductoDos2.setText(Integer.toString(PringlesCount));
				ButtonHandler(modeloRefrescos, "Pringles", "2.70", 2.70);
				ButtonHandler(modeloSandwitch, "Pringles", "2.70", 2.70);
				ButtonHandler(modeloDulces, "Pringles", "2.70", 2.70);
				ButtonHandler(modeloSnacks, "Pringles", "2.70", 2.70);
				ButtonFinalizarHandler(modeloFinalizar, "Pringles", "2.70", PringlesCount, 2.70);
			}
		});

		BtnMenosproductoDos2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (PringlesCount > 0) {
					PringlesCount--;
					textFieldProductoDos2.setText(Integer.toString(PringlesCount));
					if (PringlesCount == 0) {
						removeProductFromTable(modeloRefrescos, "Pringles");
						removeProductFromTable(modeloSnacks, "Pringles");
						removeProductFromTable(modeloDulces, "Pringles");
						removeProductFromTable(modeloSandwitch, "Pringles");
						removeProductFromTable(modeloFinalizar, "Pringles");
					} else {
						ButtonHandler(modeloRefrescos, "Pringles", "2.70", -2.70);
						ButtonHandler(modeloSandwitch, "Pringles", "2.70", -2.70);
						ButtonHandler(modeloDulces, "Pringles", "2.70", -2.70);
						ButtonHandler(modeloSnacks, "Pringles", "2.70", -2.70);
						ButtonFinalizarHandler(modeloFinalizar, "Pringles", "2.70", PringlesCount, -2.70);
					}
				}
			}
		});
		BtnplusProductoTres2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CheetosCount++;
				textFieldProductotres2.setText(Integer.toString(CheetosCount));
				ButtonHandler(modeloRefrescos, "Cheetos", "1.99", 1.99);
				ButtonHandler(modeloSnacks, "Cheetos", "1.99", 1.99);
				ButtonHandler(modeloDulces, "Cheetos", "1.99", 1.99);
				ButtonHandler(modeloSandwitch, "Cheetos", "1.99", 1.99);
				ButtonFinalizarHandler(modeloFinalizar, "Cheetos", "1.99", CheetosCount, 1.99);
			}
		});
		BtnMenosproductoTres2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CheetosCount > 0) {
					CheetosCount--;
					textFieldProductotres2.setText(Integer.toString(CheetosCount));
					if (CheetosCount == 0) {
						removeProductFromTable(modeloRefrescos, "Cheetos");
						removeProductFromTable(modeloSandwitch, "Cheetos");
						removeProductFromTable(modeloSnacks, "Cheetos");
						removeProductFromTable(modeloDulces, "Cheetos");
						removeProductFromTable(modeloFinalizar, "Cheetos");

					} else {
						ButtonHandler(modeloRefrescos, "Cheetos", "1.99", -1.99);
						ButtonHandler(modeloSnacks, "Cheetos", "1.99", -1.99);
						ButtonHandler(modeloDulces, "Cheetos", "1.99", -1.99);
						ButtonHandler(modeloSandwitch, "Cheetos", "1.99", -1.99);
						ButtonFinalizarHandler(modeloFinalizar, "Cheetos", "1.99", CheetosCount, -1.99);
					}
				}
			}
		});

		BtnplusProductoCuatro2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SnickersCount++;
				textFieldProductocuatro2.setText(Integer.toString(SnickersCount));
				ButtonHandler(modeloRefrescos, "Snickers", "1.80", 1.80);
				ButtonHandler(modeloSnacks, "Snickers", "1.80", 1.80);
				ButtonHandler(modeloDulces, "Snickers", "1.80", 1.80);
				ButtonHandler(modeloSandwitch, "Snickers", "1.80", 1.80);
				ButtonFinalizarHandler(modeloFinalizar, "Snickers", "1.80", SnickersCount, 1.80);
			}
		});
		BtnMenosproductoCuatro2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SnickersCount > 0) {
					SnickersCount--;
					textFieldProductocuatro2.setText(Integer.toString(SnickersCount));
					if (SnickersCount == 0) {
						removeProductFromTable(modeloRefrescos, "Snickers");
						removeProductFromTable(modeloSnacks, "Snickers");
						removeProductFromTable(modeloDulces, "Snickers");
						removeProductFromTable(modeloSandwitch, "Snickers");
						removeProductFromTable(modeloFinalizar, "Snickers");
					} else {
						ButtonHandler(modeloRefrescos, "Snickers", "1.80", -1.80);
						ButtonHandler(modeloSnacks, "Snickers", "1.80", -1.80);
						ButtonHandler(modeloDulces, "Snickers", "1.80", -1.80);
						ButtonHandler(modeloSandwitch, "Snickers", "1.80", -1.80);
						ButtonFinalizarHandler(modeloFinalizar, "Snickers", "1.80", SnickersCount, -1.80);
					}
				}
			}
		});
		JLabel LabelLays = new JLabel("New label");
		LabelLays.setBounds(10, 35, 137, 339);
		TipoSnacks.add(LabelLays);
		imagenes[13] = 	imagenes[13] = resizeImage(imagenes[13], LabelLays.getWidth(), LabelLays.getHeight());
		LabelLays.setIcon(imagenes[13]);

		JLabel LabelPringles = new JLabel("New label");
		LabelPringles.setBounds(190, 35, 137, 339);
		TipoSnacks.add(LabelPringles);
		imagenes[15] = 	imagenes[15] = resizeImage(imagenes[15], LabelPringles.getWidth(), LabelPringles.getHeight());
		LabelPringles.setIcon(imagenes[15]);

		JLabel LabelCheetos = new JLabel("New label");
		LabelCheetos.setBounds(370, 35, 137, 339);
		TipoSnacks.add(LabelCheetos);
		imagenes[14] = 	imagenes[14] = resizeImage(imagenes[14], LabelCheetos.getWidth(), LabelCheetos.getHeight());
		LabelCheetos.setIcon(imagenes[14]);

		JLabel LabelSnickers = new JLabel("New label");
		LabelSnickers.setBounds(550, 35, 137, 339);
		TipoSnacks.add(LabelSnickers);
		imagenes[16] = 	imagenes[16] = resizeImage(imagenes[16], LabelSnickers.getWidth(), LabelSnickers.getHeight());
		LabelSnickers.setIcon(imagenes[16]);

	}

	/**
	 * a function that manage the panel of Dulce
	 */
	private void DulcesHandler() {

		contentPane.add(TipoDulces, "TipoDulces");
		TipoDulces.setLayout(null);
		JButton BtnMenosproductoUno3 = new JButton("-");
		JButton BtnplusProductoCuatro3 = new JButton("+");
		JButton BtnVolverDul = new JButton("Volver");
		JButton BtnMenosproductoDos3 = new JButton("-");
		JButton BtnplusProductoDos3 = new JButton("+");
		JButton BtnplusProductoTres3 = new JButton("+");
		JButton BtnplusProductoUno3 = new JButton("+");
		JButton BtnMenosproductoTres3 = new JButton("-");
		JButton BtnMenosproductoCuatro3 = new JButton("-");
		JButton BtnFinalizarD = new JButton("Finalizar Compra");

		BtnMenosproductoUno3.setBounds(10, 426, 45, 23);
		BtnplusProductoUno3.setBounds(102, 426, 45, 23);
		BtnVolverDul.setBounds(10, 484, 137, 33);
		BtnMenosproductoTres3.setBounds(370, 426, 45, 23);
		BtnMenosproductoDos3.setBounds(190, 426, 45, 23);
		BtnplusProductoTres3.setBounds(462, 426, 45, 23);
		BtnMenosproductoCuatro3.setBounds(550, 426, 45, 23);
		BtnplusProductoCuatro3.setBounds(642, 426, 45, 23);
		BtnplusProductoDos3.setBounds(282, 426, 45, 23);
		BtnFinalizarD.setBounds(769, 484, 150, 33);

		TipoDulces.add(BtnMenosproductoUno3);
		TipoDulces.add(BtnplusProductoUno3);
		TipoDulces.add(BtnVolverDul);
		TipoDulces.add(BtnMenosproductoDos3);
		TipoDulces.add(BtnplusProductoDos3);
		TipoDulces.add(BtnMenosproductoTres3);
		TipoDulces.add(BtnplusProductoCuatro3);
		TipoDulces.add(BtnplusProductoTres3);
		TipoDulces.add(BtnMenosproductoCuatro3);
		TipoDulces.add(BtnFinalizarD);
		textFieldProductUno3 = new JTextField();
		textFieldProductUno3.setBounds(58, 427, 40, 21);
		textFieldProductUno3.setText(Integer.toString(countHarribo));
		textFieldProductUno3.setEditable(false);
		TipoDulces.add(textFieldProductUno3);
		textFieldProductUno3.setColumns(10);

		textFieldProductoDos3 = new JTextField();
		textFieldProductoDos3.setText(Integer.toString(countCaramel));
		textFieldProductoDos3.setEditable(false);
		textFieldProductoDos3.setColumns(10);
		textFieldProductoDos3.setBounds(238, 427, 40, 21);
		TipoDulces.add(textFieldProductoDos3);

		textFieldProductotres3 = new JTextField();
		textFieldProductotres3.setText(Integer.toString(countMilka));
		textFieldProductotres3.setEditable(false);
		textFieldProductotres3.setColumns(10);
		textFieldProductotres3.setBounds(418, 427, 40, 21);
		TipoDulces.add(textFieldProductotres3);

		textFieldProductocuatro3 = new JTextField();
		textFieldProductocuatro3.setText(Integer.toString(countKinder));
		textFieldProductocuatro3.setEditable(false);
		textFieldProductocuatro3.setColumns(10);
		textFieldProductocuatro3.setBounds(598, 427, 40, 21);
		TipoDulces.add(textFieldProductocuatro3);

		BtnVolverDul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelTipo();
			}
		});
		BtnFinalizarD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (updateFinalizarButtonState(BtnFinalizarD) == 1) {
					FinalizarCompra();
				}
			}
		});

		BtnplusProductoUno3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countHarribo++;
				textFieldProductUno3.setText(Integer.toString(countHarribo));
				ButtonHandler(modeloRefrescos, "Harribo", "3.70", 3.70);
				ButtonHandler(modeloSnacks, "Harribo", "3.70", 3.70);
				ButtonHandler(modeloSandwitch, "Harribo", "3.70", 3.70);
				ButtonHandler(modeloDulces, "Harribo", "3.70", 3.70);
				ButtonFinalizarHandler(modeloFinalizar, "Harribo", "3.70", countHarribo, 3.70);
			}
		});
		BtnMenosproductoUno3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Only decrement if countHarribo is greater than 0
				if (countHarribo > 0) {
					countHarribo--; // Decrement the count
					textFieldProductUno3.setText(Integer.toString(countHarribo)); // Update the text field

					if (countHarribo == 0) {
						removeProductFromTable(modeloRefrescos, "Harribo");
						removeProductFromTable(modeloSandwitch, "Harribo");
						removeProductFromTable(modeloDulces, "Harribo");
						removeProductFromTable(modeloSnacks, "Harribo");// Call the remove method
						removeProductFromTable(modeloFinalizar, "Harribo");
					} else {
						ButtonHandler(modeloRefrescos, "Harribo", "3.70", -3.70);
						ButtonHandler(modeloSandwitch, "Harribo", "3.70", -3.70);
						ButtonHandler(modeloDulces, "Harribo", "3.70", -3.70);
						ButtonHandler(modeloSnacks, "Harribo", "3.70", -3.70);
						ButtonFinalizarHandler(modeloFinalizar, "Harribo", "3.70", countHarribo, -3.70);

					}
				}
			}
		});

		BtnplusProductoDos3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				countCaramel++;
				textFieldProductoDos3.setText(Integer.toString(countCaramel));
				ButtonHandler(modeloRefrescos, "Caramel", "2.60", 2.60);
				ButtonHandler(modeloSandwitch, "Caramel", "2.60", 2.60);
				ButtonHandler(modeloDulces, "Caramel", "2.60", 2.60);
				ButtonHandler(modeloSnacks, "Caramel", "2.60", 2.60);
				ButtonFinalizarHandler(modeloFinalizar, "Caramel", "2.60", countCaramel, 2.60);
			}
		});

		BtnMenosproductoDos3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (countCaramel > 0) {
					countCaramel--;
					textFieldProductoDos3.setText(Integer.toString(countCaramel));
					if (countCaramel == 0) {
						removeProductFromTable(modeloRefrescos, "Caramel");
						removeProductFromTable(modeloSnacks, "Caramel");
						removeProductFromTable(modeloDulces, "Caramel");
						removeProductFromTable(modeloSandwitch, "Caramel");
						removeProductFromTable(modeloFinalizar, "Caramel");
					} else {
						ButtonHandler(modeloRefrescos, "Caramel", "2.60", -2.60);
						ButtonHandler(modeloSandwitch, "Caramel", "2.60", -2.60);
						ButtonHandler(modeloDulces, "Caramel", "2.60", -2.60);
						ButtonHandler(modeloSnacks, "Caramel", "2.60", -2.60);
						ButtonFinalizarHandler(modeloFinalizar, "Caramel", "2.60", countCaramel, -2.60);
					}
				}
			}
		});
		BtnplusProductoTres3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countMilka++;
				textFieldProductotres3.setText(Integer.toString(countMilka));
				ButtonHandler(modeloRefrescos, "Milka", "3.00", 3.00);
				ButtonHandler(modeloSnacks, "Milka", "3.00", 3.00);
				ButtonHandler(modeloDulces, "Milka", "3.00", 3.00);
				ButtonHandler(modeloSandwitch, "Milka", "3.00", 3.00);
				ButtonFinalizarHandler(modeloFinalizar, "Milka", "3.00", countMilka, 3.00);
			}
		});
		BtnMenosproductoTres3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (countMilka > 0) {
					countMilka--;
					textFieldProductotres3.setText(Integer.toString(countMilka));
					if (countMilka == 0) {
						removeProductFromTable(modeloRefrescos, "Milka");
						removeProductFromTable(modeloSandwitch, "Milka");
						removeProductFromTable(modeloSnacks, "Milka");
						removeProductFromTable(modeloDulces, "Milka");
						removeProductFromTable(modeloFinalizar, "Milka");
					} else {
						ButtonHandler(modeloRefrescos, "Milka", "3.00", -3.00);
						ButtonHandler(modeloSnacks, "Milka", "3.00", -3.00);
						ButtonHandler(modeloDulces, "Milka", "3.00", -3.00);
						ButtonHandler(modeloSandwitch, "Milka", "3.00", -3.00);
						ButtonFinalizarHandler(modeloFinalizar, "Milka", "3.00", countMilka, -3.00);
					}
				}
			}
		});

		BtnplusProductoCuatro3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countKinder++;
				textFieldProductocuatro3.setText(Integer.toString(countKinder));
				ButtonHandler(modeloRefrescos, "Kinder", "3.05", 3.05);
				ButtonHandler(modeloSnacks, "Kinder", "3.05", 3.05);
				ButtonHandler(modeloDulces, "Kinder", "3.05", 3.05);
				ButtonHandler(modeloSandwitch, "Kinder", "3.05", 3.05);
				ButtonFinalizarHandler(modeloFinalizar, "Kinder", "3.05", countKinder, 3.05);
			}
		});
		BtnMenosproductoCuatro3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (countKinder > 0) {
					countKinder--;
					textFieldProductocuatro3.setText(Integer.toString(countKinder));
					if (countKinder == 0) {
						removeProductFromTable(modeloRefrescos, "Kinder");
						removeProductFromTable(modeloSnacks, "Kinder");
						removeProductFromTable(modeloDulces, "Kinder");
						removeProductFromTable(modeloSandwitch, "Kinder");
						removeProductFromTable(modeloFinalizar, "Kinder");
					} else {
						ButtonHandler(modeloRefrescos, "Kinder", "3.05", -3.05);
						ButtonHandler(modeloSnacks, "Kinder", "3.05", -3.05);
						ButtonHandler(modeloDulces, "Kinder", "3.05", -3.05);
						ButtonHandler(modeloSandwitch, "Kinder", "3.05", -3.05);
						ButtonFinalizarHandler(modeloFinalizar, "Kinder", "3.05", countKinder, -3.05);
					}
				}
			}
		});

		JLabel LabelHaribo = new JLabel("New label");
		LabelHaribo.setBounds(10, 35, 137, 339);
		TipoDulces.add(LabelHaribo);
		imagenes[18] = 	imagenes[18] = resizeImage(imagenes[18], LabelHaribo.getWidth(), LabelHaribo.getHeight());
		LabelHaribo.setIcon(imagenes[18]);

		JLabel LabelCaramel = new JLabel("New label");
		LabelCaramel.setBounds(190, 35, 137, 339);
		TipoDulces.add(LabelCaramel);
		imagenes[17] = 	imagenes[17] = resizeImage(imagenes[17], LabelCaramel.getWidth(), LabelCaramel.getHeight());
		LabelCaramel.setIcon(imagenes[17]);

		JLabel LabelMilka = new JLabel("New label");
		LabelMilka.setBounds(370, 35, 137, 339);
		TipoDulces.add(LabelMilka);
		imagenes[19] = 	imagenes[19] = resizeImage(imagenes[19], LabelMilka.getWidth(), LabelMilka.getHeight());
		LabelMilka.setIcon(imagenes[19]);

		JLabel LabelKinder = new JLabel("New label");
		LabelKinder.setBounds(550, 35, 137, 339);
		TipoDulces.add(LabelKinder);
		imagenes[20] = 	imagenes[20] = resizeImage(imagenes[20], LabelKinder.getWidth(), LabelKinder.getHeight());
		LabelKinder.setIcon(imagenes[20]);
	}

	/**
	 * a function that manage the panel of Sandwitch
	 */
	private void SandwitchHandler() {

		contentPane.add(TipoSandwitch, "TipoSandwitch");
		TipoSandwitch.setLayout(null);
		JButton BtnMenosproductoUno4 = new JButton("-");
		JButton BtnplusProductoCuatro4 = new JButton("+");
		JButton BtnVolverSan = new JButton("Volver");
		JButton BtnMenosproductoDos4 = new JButton("-");
		JButton BtnplusProductoDos4 = new JButton("+");
		JButton BtnplusProductoTres4 = new JButton("+");
		JButton BtnplusProductoUno4 = new JButton("+");
		JButton BtnMenosproductoTres4 = new JButton("-");
		JButton BtnMenosproductoCuatro4 = new JButton("-");
		JButton BtnFinalizarSan = new JButton("Finalizar Compra");

		BtnMenosproductoUno4.setBounds(10, 426, 45, 23);
		BtnplusProductoUno4.setBounds(102, 426, 45, 23);
		BtnVolverSan.setBounds(10, 484, 137, 33);
		BtnMenosproductoTres4.setBounds(370, 426, 45, 23);
		BtnMenosproductoDos4.setBounds(190, 426, 45, 23);
		BtnplusProductoTres4.setBounds(462, 426, 45, 23);
		BtnMenosproductoCuatro4.setBounds(550, 426, 45, 23);
		BtnplusProductoCuatro4.setBounds(642, 426, 45, 23);
		BtnplusProductoDos4.setBounds(282, 426, 45, 23);
		BtnFinalizarSan.setBounds(769, 484, 150, 33);

		TipoSandwitch.add(BtnMenosproductoUno4);
		TipoSandwitch.add(BtnplusProductoUno4);
		TipoSandwitch.add(BtnVolverSan);
		TipoSandwitch.add(BtnMenosproductoDos4);
		TipoSandwitch.add(BtnplusProductoDos4);
		TipoSandwitch.add(BtnMenosproductoTres4);
		TipoSandwitch.add(BtnplusProductoCuatro4);
		TipoSandwitch.add(BtnplusProductoTres4);
		TipoSandwitch.add(BtnMenosproductoCuatro4);
		TipoSandwitch.add(BtnFinalizarSan);
		textFieldProductUno4 = new JTextField();
		textFieldProductUno4.setBounds(58, 427, 40, 21);
		textFieldProductUno4.setText(Integer.toString(countAtun));
		textFieldProductUno4.setEditable(false);
		TipoSandwitch.add(textFieldProductUno4);

		textFieldProductoDos4 = new JTextField();
		textFieldProductoDos4.setText(Integer.toString(countQueso));
		textFieldProductoDos4.setEditable(false);
		textFieldProductoDos4.setColumns(10);
		textFieldProductoDos4.setBounds(238, 427, 40, 21);
		TipoSandwitch.add(textFieldProductoDos4);

		textFieldProductotres4 = new JTextField();
		textFieldProductotres4.setText(Integer.toString(countMarmelada));
		textFieldProductotres4.setEditable(false);
		textFieldProductotres4.setColumns(10);
		textFieldProductotres4.setBounds(418, 427, 40, 21);
		TipoSandwitch.add(textFieldProductotres4);

		textFieldProductocuatro4 = new JTextField();
		textFieldProductocuatro4.setText(Integer.toString(countCrab));
		textFieldProductocuatro4.setEditable(false);
		textFieldProductocuatro4.setColumns(10);
		textFieldProductocuatro4.setBounds(598, 427, 40, 21);
		TipoSandwitch.add(textFieldProductocuatro4);

		BtnVolverSan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelTipo();

			}
		});

		BtnFinalizarSan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (updateFinalizarButtonState(BtnFinalizarSan) == 1) {
					FinalizarCompra();
				}
			}
		});

		BtnplusProductoUno4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countAtun++; // Increment the count
				textFieldProductUno4.setText(Integer.toString(countAtun));
				ButtonHandler(modeloRefrescos, "Bocadillo de Atún", "1.35", 1.35);
				ButtonHandler(modeloSnacks, "Bocadillo de Atún", "1.35", 1.35);
				ButtonHandler(modeloSandwitch, "Bocadillo de Atún", "1.35", 1.35);
				ButtonHandler(modeloDulces, "Bocadillo de Atún", "1.35", 1.35);
				ButtonFinalizarHandler(modeloFinalizar, "Bocadillo de Atún", "1.35", countAtun, 1.35);
			}
		});
		BtnMenosproductoUno4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Only decrement if countAtun is greater than 0
				if (countAtun > 0) {
					countAtun--; // Decrement the count
					textFieldProductUno4.setText(Integer.toString(countAtun));

					if (countAtun == 0) {
						removeProductFromTable(modeloRefrescos, "Bocadillo de Atún");
						removeProductFromTable(modeloSandwitch, "Bocadillo de Atún");
						removeProductFromTable(modeloDulces, "Bocadillo de Atún");
						removeProductFromTable(modeloSnacks, "Bocadillo de Atún");
						removeProductFromTable(modeloFinalizar, "Bocadillo de Atún");
					} else {
						ButtonHandler(modeloRefrescos, "Bocadillo de Atún", "1.35", -1.35);
						ButtonHandler(modeloSandwitch, "Bocadillo de Atún", "1.35", -1.35);
						ButtonHandler(modeloDulces, "Bocadillo de Atún", "1.35", -1.35);
						ButtonHandler(modeloSnacks, "Bocadillo de Atún", "1.35", -1.35);
						ButtonFinalizarHandler(modeloFinalizar, "Bocadillo de Atún", "1.35", countAtun, -1.35);
					}
				}
			}
		});
		BtnplusProductoDos4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				countQueso++;
				textFieldProductoDos4.setText(Integer.toString(countQueso));
				ButtonHandler(modeloRefrescos, "Bocadillo de Queso", "1.20", 1.20);
				ButtonHandler(modeloSandwitch, "Bocadillo de Queso", "1.20", 1.20);
				ButtonHandler(modeloDulces, "Bocadillo de Queso", "1.20", 1.20);
				ButtonHandler(modeloSnacks, "Bocadillo de Queso", "1.20", 1.20);
				ButtonFinalizarHandler(modeloFinalizar, "Bocadillo de Queso", "1.20", countQueso, 1.20);
			}
		});
		BtnMenosproductoDos4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (countQueso > 0) {
					countQueso--;
					textFieldProductoDos4.setText(Integer.toString(countQueso));
					if (countQueso == 0) {
						removeProductFromTable(modeloRefrescos, "Bocadillo de Queso");
						removeProductFromTable(modeloSnacks, "Bocadillo de Queso");
						removeProductFromTable(modeloDulces, "Bocadillo de Queso");
						removeProductFromTable(modeloSandwitch, "Bocadillo de Queso");
						removeProductFromTable(modeloFinalizar, "Bocadillo de Queso");
					} else {
						ButtonHandler(modeloRefrescos, "Bocadillo de Queso", "1.20", -1.20);
						ButtonHandler(modeloSandwitch, "Bocadillo de Queso", "1.20", -1.20);
						ButtonHandler(modeloDulces, "Bocadillo de Queso", "1.20", -1.20);
						ButtonHandler(modeloSnacks, "Bocadillo de Queso", "1.20", -1.20);
						ButtonFinalizarHandler(modeloFinalizar, "Bocadillo de Queso", "1.20", countQueso, -1.20);
					}
				}
			}
		});
		BtnplusProductoTres4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countMarmelada++;
				textFieldProductotres4.setText(Integer.toString(countMarmelada));
				ButtonHandler(modeloRefrescos, "Boc. de Mermelada", "1.05", 1.05);
				ButtonHandler(modeloSnacks, "Boc. de Mermelada", "1.05", 1.05);
				ButtonHandler(modeloDulces, "Boc. de Mermelada", "1.05", 1.05);
				ButtonHandler(modeloSandwitch, "Boc. de Mermelada", "1.05", 1.05);
				ButtonFinalizarHandler(modeloFinalizar, "Boc. de Mermelada", "1.05", countMarmelada, 1.05);
			}
		});
		BtnMenosproductoTres4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (countMarmelada > 0) {
					countMarmelada--;
					textFieldProductotres4.setText(Integer.toString(countMarmelada));
					if (countMarmelada == 0) {
						removeProductFromTable(modeloRefrescos, "Boc. de Mermelada");
						removeProductFromTable(modeloSandwitch, "Boc. de Mermelada");
						removeProductFromTable(modeloSnacks, "Boc. de Mermelada");
						removeProductFromTable(modeloDulces, "Boc. de Mermelada");
						removeProductFromTable(modeloFinalizar, "Boc. de Mermelada");
					} else {
						ButtonHandler(modeloRefrescos, "Boc. de Mermelada", "1.05", -1.05);
						ButtonHandler(modeloSnacks, "Boc. de Mermelada", "1.05", -1.05);
						ButtonHandler(modeloDulces, "Boc. de Mermelada", "1.05", -1.05);
						ButtonHandler(modeloSandwitch, "Boc. de Mermelada", "1.05", -1.05);
						ButtonFinalizarHandler(modeloFinalizar, "Boc. de Mermelada", "1.05", countMarmelada, -1.05);
					}
				}
			}
		});

		BtnplusProductoCuatro4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countCrab++;
				textFieldProductocuatro4.setText(Integer.toString(countCrab));
				ButtonHandler(modeloRefrescos, "Bocadillo de Crab", "1.40", 1.40);
				ButtonHandler(modeloSnacks, "Bocadillo de Crab", "1.40", 1.40);
				ButtonHandler(modeloDulces, "Bocadillo de Crab", "1.40", 1.40);
				ButtonHandler(modeloSandwitch, "Bocadillo de Crab", "1.40", 1.40);
				ButtonFinalizarHandler(modeloFinalizar, "Bocadillo de Crab", "1.40", countCrab, 1.40);
			}
		});
		BtnMenosproductoCuatro4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (countCrab > 0) {
					countCrab--;
					textFieldProductocuatro4.setText(Integer.toString(countCrab));
					if (countCrab == 0) {
						removeProductFromTable(modeloRefrescos, "Bocadillo de Crab");
						removeProductFromTable(modeloSnacks, "Bocadillo de Crab");
						removeProductFromTable(modeloDulces, "Bocadillo de Crab");
						removeProductFromTable(modeloSandwitch, "Bocadillo de Crab");
						removeProductFromTable(modeloFinalizar, "Bocadillo de Crab");
					} else {
						ButtonHandler(modeloRefrescos, "Bocadillo de Crab", "1.40", -1.40);
						ButtonHandler(modeloSnacks, "Bocadillo de Crab", "1.40", -1.40);
						ButtonHandler(modeloDulces, "Bocadillo de Crab", "1.40", -1.40);
						ButtonHandler(modeloSandwitch, "Bocadillo de Crab", "1.40", -1.40);
						ButtonFinalizarHandler(modeloFinalizar, "Bocadillo de Crab", "1.40", countCrab, -1.40);
					}
				}
			}
		});
		JLabel LabelAtun = new JLabel("New label");
		LabelAtun.setBounds(10, 35, 137, 339);
		TipoSandwitch.add(LabelAtun);
		imagenes[5] = 	imagenes[5] = resizeImage(imagenes[5], LabelAtun.getWidth(), LabelAtun.getHeight());
		LabelAtun.setIcon(imagenes[5]);

		JLabel LabelQueso = new JLabel("New label");
		LabelQueso.setBounds(190, 35, 137, 339);
		TipoSandwitch.add(LabelQueso);
		imagenes[6] = 	imagenes[6] = resizeImage(imagenes[6], LabelQueso.getWidth(), LabelQueso.getHeight());
		LabelQueso.setIcon(imagenes[6]);

		JLabel LabelMermelada = new JLabel("New label");
		LabelMermelada.setBounds(370, 35, 137, 339);
		TipoSandwitch.add(LabelMermelada);
		imagenes[7] = 	imagenes[7] = resizeImage(imagenes[7], LabelMermelada.getWidth(), LabelMermelada.getHeight());
		LabelMermelada.setIcon(imagenes[7]);

		JLabel LabelCrab = new JLabel("New label");
		LabelCrab.setBounds(550, 35, 137, 339);
		TipoSandwitch.add(LabelCrab);
		imagenes[8] = 	imagenes[8] = resizeImage(imagenes[8], LabelCrab.getWidth(), LabelCrab.getHeight());
		LabelCrab.setIcon(imagenes[8]);
	}

	/**
	 * A function that creat the cart
	 */
	private void carroCreator() {
		// ScrollPane for TipoRefrescos
		JScrollPane scrollPaneRefrescos = new JScrollPane();
		scrollPaneRefrescos.setBounds(715, 35, 250, 415);
		TipoRefrescos.add(scrollPaneRefrescos);

		// Create table model with column names
		modeloRefrescos.addColumn("Producto"); // Column 1
		modeloRefrescos.addColumn("Precio"); // Column 2

		// Create the table using the model
		JTable tableRefrescos = new JTable(modeloRefrescos);
		tableRefrescos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
		scrollPaneRefrescos.setViewportView(tableRefrescos);

		JScrollPane scrollPaneDulces = new JScrollPane();
		scrollPaneDulces.setBounds(715, 35, 250, 415);
		TipoDulces.add(scrollPaneDulces);

		modeloDulces.addColumn("Producto");
		modeloDulces.addColumn("Precio");

		JTable tableDulces = new JTable(modeloDulces);
		tableDulces.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
		scrollPaneDulces.setViewportView(tableDulces);

		JScrollPane scrollPaneSandwitch = new JScrollPane();
		scrollPaneSandwitch.setBounds(715, 35, 250, 415);
		TipoSandwitch.add(scrollPaneSandwitch);

		modeloSandwitch.addColumn("Producto");
		modeloSandwitch.addColumn("Precio");

		JTable tableSandwitch = new JTable(modeloSandwitch);
		tableSandwitch.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
		scrollPaneSandwitch.setViewportView(tableSandwitch);

		JScrollPane scrollPaneSnacks = new JScrollPane();
		scrollPaneSnacks.setBounds(715, 35, 250, 415);
		TipoSnacks.add(scrollPaneSnacks);

		modeloSnacks.addColumn("Producto");
		modeloSnacks.addColumn("Precio");

		JTable tableSnacks = new JTable(modeloSnacks);
		tableSnacks.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
		scrollPaneSnacks.setViewportView(tableSnacks);
	}

	/**
	 * this function build the table of the Panel summary
	 */
	private void finalizarHandler() {
		JButton BtnPagar = new JButton("Pagar");
		BtnPagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "Pagar");
				calcularTotalConIVA(modeloFinalizar);

			}
		});
		BtnPagar.setBounds(423, 484, 125, 33);
		PanelFinalizar.add(BtnPagar);

		JButton BtnInicio = new JButton("Volver al Inicio");
		BtnInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BorrarTodo();
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "PanelBienvenida");
			}
		});
		BtnInicio.setBounds(814, 484, 150, 33);
		PanelFinalizar.add(BtnInicio);
		JScrollPane scrollPaneFinalizar = new JScrollPane();
		scrollPaneFinalizar.setBounds(10, 46, 954, 402);
		PanelFinalizar.add(scrollPaneFinalizar);

		// Create table model with column names
		modeloFinalizar.addColumn("Producto");
		modeloFinalizar.addColumn("Cantidad");// Column 1
		modeloFinalizar.addColumn("Precio"); // Column 2
		modeloFinalizar.addColumn("Precio con IVA");

		// Create the table using the model
		JTable tableFinalizar = new JTable(modeloFinalizar);
		tableFinalizar.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
		scrollPaneFinalizar.setViewportView(tableFinalizar);

	}

	/**
	 * this function calculate the change that we need to return
	 * 
	 * @param change that we need to convert
	 * @return Return the breakdown of change
	 */
	private String calcularDesgloseCambio(double change) {
		String breakdown = ""; // Use a regular String instead of StringBuilder
		int[] monedas = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 }; // in cents

		// Convert change to cents
		int cambioEnCentimos = (int) (change * 100 + 0.5);

		for (int i = 0; i < monedas.length; i++) {
			int moneda = monedas[i];
			int cantidadMonedas = cambioEnCentimos / moneda; // Calculate number of each denomination
			if (cantidadMonedas > 0) {
				// Check if the denomination is 100 cents or more (1 euro or more)
				if (moneda >= 100) {
					if (moneda < 500) {
						breakdown += cantidadMonedas + " moneda(s) de " + (moneda / 100.0) + "€\n";
					} else {
						breakdown += cantidadMonedas + " billete(s) de " + (moneda / 100.0) + "€\n";
					}
				} else {
					breakdown += cantidadMonedas + " moneda(s) de " + moneda + " centimos\n";
				}
				cambioEnCentimos %= moneda; // Remaining change after using that denomination
			}
		}

		return breakdown;
	}

	/**
	 * this function calculate the total price with IVA
	 * 
	 * @param modeloFinalizar the table where we will put the result
	 * @return the total price
	 */
	private double calcularTotalConIVA(DefaultTableModel modeloFinalizar) {
		double total = 0.0;

		for (int rowIndex = 0; rowIndex < modeloFinalizar.getRowCount(); rowIndex++) {
			String precioConIVAString = (String) modeloFinalizar.getValueAt(rowIndex, 3);
			precioConIVAString = precioConIVAString.replace(",", ".");
			double precioConIVA = Double.parseDouble(precioConIVAString);
			total += precioConIVA;
		}

		textResult1.setText(String.format("%.2f€", total));

		return total;
	}

	/**
	 * this function manage the Pay panel
	 */
	private void pagarHandler() {
		PanelPagar.setLayout(null);
		textField.setText("");
		textField.setBounds(417, 81, 323, 126);
		PanelPagar.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);

		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "7");
			}
		});
		btn7.setBounds(406, 274, 89, 37);
		PanelPagar.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "8");
			}
		});
		btn8.setBounds(532, 274, 89, 37);
		PanelPagar.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "9");
			}
		});
		btn9.setBounds(651, 274, 89, 37);
		PanelPagar.add(btn9);

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "4");
			}
		});
		btn4.setBounds(406, 328, 89, 37);
		PanelPagar.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "5");
			}
		});
		btn5.setBounds(532, 328, 89, 37);
		PanelPagar.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "6");
			}
		});
		btn6.setBounds(651, 328, 89, 37);
		PanelPagar.add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "1");
			}

		});
		btn1.setBounds(406, 385, 89, 37);
		PanelPagar.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "2");
			}
		});
		btn2.setBounds(532, 385, 89, 37);
		PanelPagar.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "3");
			}
		});
		btn3.setBounds(651, 385, 89, 37);
		PanelPagar.add(btn3);

		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String currentText = textField.getText();
				textField.setText(currentText + "0");
			}
		});
		btn0.setBounds(404, 437, 89, 37);
		PanelPagar.add(btn0);
		JButton BtnComa = new JButton(".");

		BtnComa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String currentText = textField.getText();
				// Check if the current text is empty or already has a period at the start (for
				// ".05" case)
				if (currentText.isEmpty() || (currentText.equals(".") || currentText.startsWith("."))) {
					// Do not allow input like ".05" or any string starting with "."
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error de Entrada",
							JOptionPane.ERROR_MESSAGE);
					return; // Exit if the condition is met
				}
				// Check if the current text already contains a period
				if (currentText.contains(".")) {
					// If it does, ensure that there are no additional periods being added (to avoid
					// "7...5" case)
					JOptionPane.showMessageDialog(null, "Ya se ha ingresado un punto decimal.", "Error de Entrada",
							JOptionPane.ERROR_MESSAGE);
					return; // Exit if the condition is met
				}
				// Append the period to the current text
				textField.setText(currentText + ".");
			}
		});
		BtnComa.setBounds(532, 437, 89, 37);
		PanelPagar.add(BtnComa);
		JButton BtnBorrar = new JButton("Borrar");
		BtnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		BtnBorrar.setBounds(651, 437, 89, 37);
		PanelPagar.add(BtnBorrar);

		JButton BtnPagar1 = new JButton("Pagar");
		BtnPagar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String inputAmountText = textField.getText().trim().replace(",", "."); // Replace comma for decimal

				if (inputAmountText.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad.", "Error de Pago",
							JOptionPane.ERROR_MESSAGE);
					return;
				} else {
					double inputAmount = Double.parseDouble(inputAmountText); // Convert input to double
					// Calculate the total from your table
					double totalPrice = calcularTotalConIVA(modeloFinalizar); // Call your method to calculate total
					// Compare input amount with total price
					if (inputAmount < totalPrice) {
						double amountNeeded = totalPrice - inputAmount;
						JOptionPane.showMessageDialog(
								null, "Fondos insuficientes. Por favor, inserte más "
										+ String.format("%.2f", amountNeeded) + "€ más.",
								"Error de Pago", JOptionPane.ERROR_MESSAGE);
					} else {
						double change = inputAmount - totalPrice; // Calculate change

						if (change > 0) {
							String changeBreakdown = calcularDesgloseCambio(change); // Get breakdown of change
							BorrarTodo();
							// Update the textFieldFinish with the change breakdown
							textFieldFinish.setText("Cambio a devolver: " + changeBreakdown);
							Timer timer = new Timer(10000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									// Switch back to the welcome panel after 10 seconds
									CardLayout layout = (CardLayout) getContentPane().getLayout();
									layout.show(getContentPane(), "PanelBienvenida");
								}
							});
							timer.setRepeats(false); // Ensure the timer only runs once
							timer.start();
							// Optionally, switch to the finish panel
							CardLayout layout = (CardLayout) getContentPane().getLayout();
							layout.show(getContentPane(), "PanelFinish");
						} else {
							// No change to return
							textFieldFinish.setText("Total pagado: " + totalPrice + "€");
							BorrarTodo();
							Timer timer = new Timer(10000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									// Switch back to the welcome panel after 10 seconds
									CardLayout layout = (CardLayout) getContentPane().getLayout();
									layout.show(getContentPane(), "PanelBienvenida"); // Change this to your actual //
																						// welcome panel name
								}
							});
							timer.setRepeats(false);
							timer.start();
							CardLayout layout = (CardLayout) getContentPane().getLayout();
							layout.show(getContentPane(), "PanelFinish");
						}
					}
				}
			}
		});
		BtnPagar1.setBounds(121, 379, 226, 77);
		PanelPagar.add(BtnPagar1);
		textResult1 = new JTextField();
		textResult1.setBounds(121, 81, 226, 259);
		PanelPagar.add(textResult1);
		textResult1.setColumns(10);
		textResult1.setEditable(false);
	}

	/**
	 * the main function that we call inside other helper functions
	 */
	public VendingMachineInterfaceClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		PutImg();
		// Create Panel
		contentPane.add(PanelBienvenida, "PanelBienvenida");
		PanelBienvenida.setLayout(null);

		JLabel LabelImg = new JLabel("");
		LabelImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // event when we click on the image
				ChangePanelTipo(); // Call the Panel Tipos
			}
		});
		LabelImg.setBounds(0, 0, 974, 551);
		PanelBienvenida.add(LabelImg);
		imagenes[0] = resizeImage(imagenes[0], LabelImg.getWidth(), LabelImg.getHeight());
		LabelImg.setIcon(imagenes[0]);

		JPanel PanelTipos = new JPanel();
		contentPane.add(PanelTipos, "Tipos");
		PanelTipos.setLayout(null);

		JLabel lblTipo1 = new JLabel("New label");
		lblTipo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelSandwitch();
			}
		});
		lblTipo1.setBounds(58, 80, 170, 340);
		PanelTipos.add(lblTipo1);
		imagenes[1] = resizeImage(imagenes[1], lblTipo1.getWidth(), lblTipo1.getHeight());
		lblTipo1.setIcon(imagenes[1]);

		JLabel lblTipo2 = new JLabel("New label");
		lblTipo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelDulce();
			}
		});
		lblTipo2.setBounds(286, 80, 170, 340);
		PanelTipos.add(lblTipo2);
		imagenes[2] = resizeImage(imagenes[2], lblTipo2.getWidth(), lblTipo2.getHeight());
		lblTipo2.setIcon(imagenes[2]);
		
		JLabel lblTipo3 = new JLabel("New label");
		lblTipo3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelRefresco();
			}
		});
		lblTipo3.setBounds(514, 80, 170, 340);
		PanelTipos.add(lblTipo3);
		imagenes[3] = resizeImage(imagenes[3], lblTipo3.getWidth(), lblTipo3.getHeight());
		lblTipo3.setIcon(imagenes[3]);

		JLabel lblTipo4 = new JLabel("New label");
		lblTipo4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelSnack();
			}
		});
		lblTipo4.setBounds(742, 80, 170, 340);
		PanelTipos.add(lblTipo4);
		imagenes[4] = resizeImage(imagenes[4], lblTipo4.getWidth(), lblTipo4.getHeight());
		lblTipo4.setIcon(imagenes[4]);

		JButton BtnVolverTipos = new JButton("Volver");
		BtnVolverTipos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BorrarTodo();
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "PanelBienvenida");
			}
		});
		BtnVolverTipos.setBounds(58, 484, 137, 33);
		PanelTipos.add(BtnVolverTipos);

		RefrescosHandler();
		SnackHandler();
		finalizarHandler();
		carroCreator();
		DulcesHandler();
		SandwitchHandler();
		pagarHandler();
		contentPane.add(TipoDulces, "TipoDulces");
		TipoDulces.setLayout(null);

		contentPane.add(TipoSnacks, "TipoSnacks");
		TipoSnacks.setLayout(null);

		contentPane.add(TipoSandwitch, "TipoSandwitch");
		TipoSandwitch.setLayout(null);

		contentPane.add(PanelFinalizar, "Finalizar");
		PanelFinalizar.setLayout(null);

		JButton BtnVolverFinalizar = new JButton("Volver");
		BtnVolverFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "Tipos");
			}
		});
		BtnVolverFinalizar.setBounds(10, 484, 137, 33);
		PanelFinalizar.add(BtnVolverFinalizar);
		contentPane.add(PanelPagar, "Pagar");

		JButton BtnVolverPagar = new JButton("Volver");
		BtnVolverPagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FinalizarCompra();
			}
		});
		BtnVolverPagar.setBounds(10, 484, 137, 33);
		PanelPagar.add(BtnVolverPagar);

		JPanel PanelFinish = new JPanel();
		contentPane.add(PanelFinish, "PanelFinish");
		PanelFinish.setLayout(null);

		textFieldFinish = new JTextArea();
		textFieldFinish.setBounds(96, 50, 832, 457);
		PanelFinish.add(textFieldFinish);
		textFieldFinish.setColumns(10);
		textFieldFinish.setLineWrap(true);
		textFieldFinish.setWrapStyleWord(true);
		textFieldFinish.setEditable(false);
	}
}
