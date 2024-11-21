# Elorrieta Vending Machine System

## Project Overview

The **Elorrieta Vending Machine System** is a project developed during my **Grado Superior de DAM** at **Elorrieta**. It is composed of two distinct parts:

1. **Customer Interaction Application (WindowBuilder)**: This part allows customers to interact with the vending machine to purchase products.
2. **Administrative Management Application**: This part is for employees to manage the products in the vending machine, including adding, editing, and deleting products.

Additionally, there is a **website** that supports the vending machine system, providing a user-friendly interface for products and information.

---

## Customer Interaction Application (WindowBuilder)

The customer interaction application will run in the terminal and consists of several phases:

### 1. Welcome Message
When a customer approaches the vending machine, a welcome message will be displayed, prompting the customer to press a button to continue.

### 2. Product Types
The customer will be shown the four available product types:
- **Type 1**
- **Type 2**
- **Type 3**
- **Type 4**

### 3. Product Selection
After selecting a product type, the available products will be displayed along with their prices (without VAT). The customer will select the products they want to purchase. 

Each time a product is selected, it will be added to the shopping list, where the customer can view the product name and price. At this point, the customer can:
- Choose more products.
- Go back to select a different product type.
- Proceed to the purchase summary.

### 4. Purchase Summary
The purchase summary will display the products selected, including the quantity, price, and price with VAT (21%). The customer can either:
- Confirm the purchase and proceed to payment.
- Restart the process from the welcome message.

### 5. Payment Process
In the payment phase, the customer will be asked to enter the amount they will pay. The system will ensure that the entered amount is sufficient to cover the total cost. If the amount is insufficient, the system will prompt the customer for the remaining amount.

Once the customer enters the correct amount, the system will calculate the change and provide it in the minimum number of coins and bills possible (coins of 1¢, 2¢, 5¢, 10¢, 20¢, 50¢, 1€, 2€, and bills of 5€, 10€, 20€, 50€, 100€, and 200€).

Finally, the system will thank the customer and, after 10 seconds, return to the welcome message.

---

## Administrative Management Application

The administrative part allows employees to manage the products in the vending machine. The steps are as follows:

### 1. Login
Employees must log in with a username and password. If the credentials are incorrect, the system will display an error message and return to the welcome screen.

### 2. Menu Options
Once logged in, the following options will be available:
- **Add New Product**: Allows the employee to add a new product with a unique identifier, name, type, and price.
- **Modify Product**: Allows the employee to modify the name, price, or type of an existing product.
- **Delete Product**: Allows the employee to delete a product from the system.
- **Exit**: Logs out the employee and returns to the welcome screen.

### 3. Add New Product
The employee will be prompted to enter the product type, unique identifier, name, and price. All data will be validated, and the employee will be given the opportunity to re-enter the data if there are errors.

### 4. Modify Product
The employee will see a list of all available products, showing the product code, name, price, and type. After selecting a product, the employee can modify:
- The product name
- The product price
- The product type

Changes will be validated to ensure the new data matches the selected type (e.g., the price must be a numeric value).

### 5. Delete Product
The employee can delete a product by selecting it from the list. Once deleted, the system will confirm the product has been removed.

---

## Website Features

The website that supports the vending machine system will have the following key features:

### 1. Full Validation
All pages will be fully validated to ensure proper functionality and correct user interactions.

### 2. Creative Commons Licenses
All content, including the website itself, will be under Creative Commons licenses.

### 3. Website Structure
- The website will have at least **three pages**, with a homepage (`index.html`).
- All pages will have a **common header**, **footer**, and **navigation section**.
- The layout will be responsive, using **flexbox** and **GridLayout** for content organization, with at least **four blocks** per page (header, menu, content, footer).

### 4. Design and Content
- All pages will have a coherent theme, and the format will be uniform.
- Navigation links between pages will be clearly visible and easy to use.
- Text will be well-written with special attention to spelling and grammar.
- Multimedia elements (images, videos, etc.) will be organized in folders with clear names to avoid errors.

### 5. Styling
All styles will be defined in a **separate CSS file**, and no inline styles will be used within the HTML documents.

---

## Conclusion

The **Elorrieta Vending Machine System** aims to provide a seamless experience for customers and efficient product management for employees. The system includes both a terminal application and a web interface to make interactions intuitive and user-friendly. By implementing these features, we ensure the efficient operation and management of the vending machine, with a focus on ease of use, security, and reliability.

---

## Project Information

This project was developed as part of the **Grado Superior de Desarrollo de Aplicaciones Multiplataforma (DAM)** at **Elorrieta**.

---

Feel free to make any adjustments if needed, and you can now copy the entire content and paste it into your `README.md` file on GitHub!
