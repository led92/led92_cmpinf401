package led92_MenuManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuManagerGUI{

//main window frame
	private JFrame frmMainWindow;
//panel1
	private JPanel panel1;
//panel1 labels
	private JLabel lblEntree;
	private JLabel lblSide;
	private JLabel lblSalad;
	private JLabel lblDessert;
//panel1 comboboxes
	private JComboBox<String> cboEntree;
	private JComboBox<String> cboSide;
	private JComboBox<String> cboSalad;
	private JComboBox<String> cboDessert;
//index of selected item
	private int selectedIndex;
//"Create Menu with these dishes" button
		private JButton btnCreate;
//user input frame
	private JFrame frmUserInput;
//user input label
	private JLabel lblUserInput;
//user input text field
	private JTextField txtUserInput;
//"Created Menus:" label at the top right of the main window frame
    private JLabel lblTopRight;
//menu list
    private DefaultListModel<Menu> menuListModel;
    private JList<Menu> menuList;
//"Submit" button
	private JButton btnEnter;
//new Menu name String
	private String input;
//panel2
    private JPanel panel2;
//panel2 buttons
    private JButton btnRandom;
    private JButton btnMinCal;
    private JButton btnMaxCal;
//menu list buttons
    private JButton btnDetails;
    private JButton btnDelete;
    private JButton btnSave;
//menu frame
    private JFrame frmMenu;
//menu frame labels
    private JLabel lblTotCal;
    private JLabel lblTotPrice;
//menu frame text areas
    private JTextArea txtEntDes;
    private JTextArea txtSidDes;
    private JTextArea txtSalDes;
    private JTextArea txtDesDes;
    private JTextField txtTotCal;
    private JTextField txtTotPrice; 
    
    private MenuManager manager = new MenuManager("data/dishes.txt");
    ArrayList<MenuItem> items = new ArrayList <MenuItem>();

	public MenuManagerGUI(){
		
//main window frame
			
	frmMainWindow = new JFrame("Menu Manager"); 
	frmMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frmMainWindow.setResizable(false); 
	frmMainWindow.setBounds(300,100,750,600); 
	frmMainWindow.setLayout(null);

//panel1
	
    panel1 = new JPanel();
    panel1.setBorder(BorderFactory.createTitledBorder("Build your own Menu"));
    panel1.setBounds(25,10,400,300);
    panel1.setLayout(null);
    
 // panel1 labels 
    
    lblEntree = new JLabel("Entree:");
    panel1.add(lblEntree);
    lblEntree.setBounds(25,50,100,25);
    
    lblSide = new JLabel("Side:");
    panel1.add(lblSide);
    lblSide.setBounds(25,100,100,25);
    
    lblSalad = new JLabel("Salad:");
    panel1.add(lblSalad);
    lblSalad.setBounds(25,150,100,25);
    
    lblDessert = new JLabel("Dessert:");
    panel1.add(lblDessert);
    lblDessert.setBounds(25,200,100,25);
    
//panel1 comboboxes, add items to each combobox
    
    
    
    ArrayList<MenuItem> entrees = manager.getItems();
	cboEntree = new JComboBox<String>();
	for (MenuItem entree : entrees) {
	    if (entree instanceof Entree) {
	        String entreeName = entree.toString();
	        cboEntree.addItem(entreeName);
	    }
    }

	ArrayList<MenuItem> sides = manager.getItems();
	cboSide = new JComboBox<String>();
	for (MenuItem side : sides) {
	    if (side instanceof Side) {
	        String sideName = side.toString();
	        cboSide.addItem(sideName);
	    }
    }
	
	ArrayList<MenuItem> salads = manager.getItems();
	cboSalad = new JComboBox<String>();
	for (MenuItem salad : salads) {
	    if (salad instanceof Salad) {
	        String saladName = salad.toString();
	        cboSalad.addItem(saladName);
	    }
    }

	
	ArrayList<MenuItem> desserts = manager.getItems();
	cboDessert = new JComboBox<String>();
	for (MenuItem dessert : desserts) {
	    if (dessert instanceof Dessert) {
	        String dessertName = dessert.toString();
	        cboDessert.addItem(dessertName);
	    }
    }


//panel1 comboboxes, add name, description, calories, and price to text areas in menu frame

    panel1.add(cboEntree); 
    cboEntree.setBounds(180,50,190,25);
    cboEntree.setSelectedIndex(0);
    cboEntree.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = cboEntree.getSelectedIndex();
            String selectedEntree = cboEntree.getItemAt(selectedIndex);

            for (MenuItem entree : entrees) {
                if (entree.toString().equals(selectedEntree)) {
                    txtEntDes.setText(entree.toString() + "\n" + entree.getDescription() + "\n" + "Calories: " + entree.getCalories() + "\n" + "Price: $" + entree.getPrice());
                    break;
                }
            }
        }
    });


    panel1.add(cboSide);
    cboSide.setBounds(180,100,190,25);
    cboSide.setSelectedIndex(0);
    cboSide.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = cboSide.getSelectedIndex();
            String selectedSide = cboSide.getItemAt(selectedIndex);

            for (MenuItem side : sides) {
                if (side.toString().equals(selectedSide)) {
                    txtSidDes.setText(side.toString() + "\n" + side.getDescription() + "\n" + "Calories: " + side.getCalories() + "\n" + "Price: $" + side.getPrice());
                    break;
                }
            }
        }
    });

    panel1.add(cboSalad);
    cboSalad.setBounds(180,150,190,25);
    cboSalad.setSelectedIndex(0);
    cboSalad.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = cboSalad.getSelectedIndex();
            String selectedSalad = cboSalad.getItemAt(selectedIndex);

            for (MenuItem salad : salads) {
                if (salad.toString().equals(selectedSalad)) {
                    txtSalDes.setText(salad.toString() + "\n" + salad.getDescription() + "\n" + "Calories: " + salad.getCalories() + "\n" + "Price: $" + salad.getPrice());
                    break;
                }
            }
        }
    });

    panel1.add(cboDessert);
    cboDessert.setBounds(180,200,190,25);
    cboDessert.setSelectedIndex(0);
    cboDessert.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = cboDessert.getSelectedIndex();
            String selectedDessert = cboDessert.getItemAt(selectedIndex);

            for (MenuItem dessert : desserts) {
                if (dessert.toString().equals(selectedDessert)) {
                    txtDesDes.setText(dessert.toString() + "\n" + dessert.getDescription() + "\n" + "Calories: " + dessert.getCalories() + "\n" + "Price: $" + dessert.getPrice());
                    break;
                }
            }
         
        }
    });
    
//panel 1 button that sets user input frame visible
    
    btnCreate = new JButton("Create Menu with these dishes");
    panel1.add(btnCreate);
    btnCreate.setBounds(70,250,250,25);
    btnCreate.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			frmUserInput.setVisible(true);
		}
	});
 
//user input frame
    
    frmUserInput = new JFrame();
    frmUserInput.setResizable(false); 
    frmUserInput.setBounds(300,100,300,200); 
    frmUserInput.setLayout(null);
    
//user input frame label
    
    lblUserInput = new JLabel("Enter the name of your New Menu:");
    lblUserInput.setBounds(40,20,250,25);
    frmUserInput.add(lblUserInput);
    
//user input frame text field
    
    txtUserInput = new JTextField();
    txtUserInput.setBounds(20,50,260,25);
    frmUserInput.add(txtUserInput);
    input = new String (txtUserInput.getText());
    
//"Created Menus:" label at the top right of the main window frame
    
    lblTopRight = new JLabel("Created Menus:");
    lblTopRight.setBounds(430,0,100,50);
    
//menuList
   
    menuListModel = new DefaultListModel<Menu>();
    menuList = new JList<Menu>(menuListModel);
    menuList.setBounds(430,40,300,450);
    
//Enter (Submit) button
    
	btnEnter = new JButton("Submit");
	btnEnter.setBounds(100,80,100,50);
	frmUserInput.add(btnEnter);

//panel2
	
    panel2 = new JPanel();
    panel2.setBorder(BorderFactory.createTitledBorder("Or generate a Menu"));
    panel2.setBounds(25,320,400,230);
    panel2.setLayout(null);

//button that generates a random menu
    
    btnRandom = new JButton("Generate a Random Menu");
    panel2.add(btnRandom);
    btnRandom.setBounds(70,65,250,25);
    btnRandom.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  
			  Menu randomMenu = manager.randomMenu("Random Menu");
			  
			  System.out.println("Name: " + randomMenu.toString());
				System.out.println("Description: " + "\n" + randomMenu.description());
				System.out.println("\nTotal Calories: " + randomMenu.totalCalories());
				System.out.println("Total Price: $" + randomMenu.totalPrice());
				System.out.println();
			
			  menuListModel.addElement(randomMenu);
		        
		        frmMenu.setTitle("Random Menu");
		        frmMenu.setVisible(true);
		    }
		});
    
  
  //button that generates a minimum calories menu
    
    btnMinCal = new JButton("Generate a Minimum Calories Menu");
    panel2.add(btnMinCal);
    btnMinCal.setBounds(70,105,250,25);
    btnMinCal.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  
			  Menu minCaloriesMenu = manager.minCaloriesMenu("Minimum Calories Menu");
			
			  menuListModel.addElement(minCaloriesMenu);
		        
		        frmMenu.setTitle("Minimum Calories Menu");
		        frmMenu.setVisible(true);
		    }
		});
    
  //button that generates a maximum calories menu
    
    btnMaxCal = new JButton("Generate a Maximum Calories Menu");
    panel2.add(btnMaxCal);
    btnMaxCal.setBounds(70,145,250,25);
    btnMaxCal.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  
			  Menu maxCaloriesMenu = manager.maxCaloriesMenu("Maximum Calories Menu");
			
			  menuListModel.addElement(maxCaloriesMenu);
		        
		        frmMenu.setTitle("Maximum Calories Menu");
		        frmMenu.setVisible(true);
		    }
		});

//menu frame
    
    frmMenu = new JFrame(); 
	frmMenu.setResizable(false); 
	frmMenu.setBounds(300,100,750,600); 
	frmMenu.setLayout(null);
	
//Details button, opens new menu frame text box that corresponds with selected menuList item
    
    btnDetails = new JButton("Details");
    btnDetails.setBounds(430,500,100,50);
    	    
//Delete button, clears menuList
    
    btnDelete = new JButton("Delete All");
    btnDelete.setBounds(530,500,100,50);
    btnDelete.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            menuList.setToolTipText("");
        }
    });

//Save button, writes created menus to file data/menus.txt
    
    btnSave = new JButton("Save to File");
    btnSave.setBounds(630,500,100,50);
   
//add main window frame elements to main window frame
    
	frmMainWindow.add(panel1);
	frmMainWindow.add(panel2);
	frmMainWindow.add(lblTopRight);
	frmMainWindow.add(menuList);
	frmMainWindow.add(btnDetails);
	frmMainWindow.add(btnDelete);
	frmMainWindow.add(btnSave);
	frmMainWindow.setVisible(true);

//menu frame labels
	
	lblEntree = new JLabel("Entree:");
	lblEntree.setBounds(35,10,200,30);
	frmMenu.add(lblEntree);
	
	lblSide = new JLabel("Side:");
	lblSide.setBounds(35,110,200,30);
	frmMenu.add(lblSide);

	lblSalad = new JLabel("Salad:");
	lblSalad.setBounds(35,210,200,30);
	frmMenu.add(lblSalad);
	
	lblDessert = new JLabel("Dessert:");
	lblDessert.setBounds(35,310,200,30);
	frmMenu.add(lblDessert);
	
	lblTotCal = new JLabel("Total Calories:");
	lblTotCal.setBounds(35,410,200,30);
	frmMenu.add(lblTotCal);
	
	lblTotPrice = new JLabel("Total Price:     $");
	lblTotPrice.setBounds(35,470,200,30);
	frmMenu.add(lblTotPrice);
	
//menu frame descriptions, total calories, and total price

	txtEntDes = new JTextArea();
	txtEntDes.setBounds(100,10,600,75);
	txtEntDes.setEditable(false);
	frmMenu.add(txtEntDes);
	selectedIndex = cboEntree.getSelectedIndex();
	String selectedEntree = cboEntree.getItemAt(selectedIndex);
	
	for (MenuItem entree : entrees) {
	    if (entree.toString().equals(selectedEntree)) {
	        txtEntDes.setText(entree.getDescription());
	        break;
	    }
	}
	
	txtSidDes = new JTextArea();
	txtSidDes.setBounds(100,100,600,75);
	txtSidDes.setEditable(false);
	frmMenu.add(txtSidDes);
	selectedIndex = cboSide.getSelectedIndex();
	String selectedSide = cboSide.getItemAt(selectedIndex);
	
	for (MenuItem side : sides) {
	    if (side.toString().equals(selectedSide)) {
	        txtSidDes.setText(side.getDescription());
	        break;
	    }
	}
	
	txtSalDes = new JTextArea();
	txtSalDes.setBounds(100,210,600,75);
	txtSalDes.setEditable(false);
	frmMenu.add(txtSalDes);
	selectedIndex = cboSalad.getSelectedIndex();
	String selectedSalad = cboSalad.getItemAt(selectedIndex);

	for (MenuItem salad : salads) {
	    if (salad.toString().equals(selectedSalad)) {
	        txtSalDes.setText(salad.getDescription());
	        break;
	    }
	}
	
	txtDesDes = new JTextArea();
	txtDesDes.setBounds(100,310,600,75);
	txtDesDes.setEditable(false);
	frmMenu.add(txtDesDes);
	selectedIndex = cboDessert.getSelectedIndex();
	String selectedDessert = cboDessert.getItemAt(selectedIndex);

	for (MenuItem dessert : desserts) {
	    if (dessert.toString().equals(selectedDessert)) {
	        txtDesDes.setText(dessert.getDescription());
	        break;
	    }
	}
	
	txtTotCal = new JTextField();
	txtTotCal.setBounds(150,410,100,25);
	txtTotCal.setEditable(false);
	frmMenu.add(txtTotCal);
	
	txtTotPrice = new JTextField();
	txtTotPrice.setBounds(150,470,100,25);
	txtTotPrice.setEditable(false);
	frmMenu.add(txtTotPrice);

	//"Submit" button also creates new menu and adds the menu name to menuList
	
			btnEnter.addActionListener(new ActionListener() {
				  public void actionPerformed(ActionEvent e) {
				  
					// Get the selected items from the JComboBoxes
					  String entreeName = (String) cboEntree.getSelectedItem();
					  String sideName = (String) cboSide.getSelectedItem();
					  String saladName = (String) cboSalad.getSelectedItem();
					  String dessertName = (String) cboDessert.getSelectedItem();
					  
					  
					  
					  Entree entree = null;
					  Side side = null;
					  Salad salad = null;
					  Dessert dessert = null;
					  
					 
					  for (MenuItem item : items) {
					      if (item.toString().equals(entreeName)) {
					          entree = (Entree) item;
					          if (entree.toString().equals(entreeName)) {
				                    txtEntDes.setText(entree.toString() + "\n" + entree.getDescription() + "\n" + "Calories: " + entree.getCalories() + "\n" + "Price: $" + entree.getPrice());
				                    
				                }
					      } else if (item.toString().equals(sideName)) {
					          side = (Side) item;
					          if (side.toString().equals(sideName)) {
				                    txtSidDes.setText(side.toString() + "\n" + side.getDescription() + "\n" + "Calories: " + side.getCalories() + "\n" + "Price: $" + side.getPrice());
				                    
				                }
					      } else if (item.toString().equals(saladName)) {
					          salad = (Salad) item;
					          if (salad.toString().equals(saladName)) {
				                    txtSalDes.setText(salad.toString() + "\n" + salad.getDescription() + "\n" + "Calories: " + salad.getCalories() + "\n" + "Price: $" + salad.getPrice());
				                    
				                }
					      } else if (item.toString().equals(dessertName)) {
					          dessert = (Dessert) item;
					          if (dessert.toString().equals(dessertName)) {
				                    txtDesDes.setText(dessert.toString() + "\n" + dessert.getDescription() + "\n" + "Calories: " + dessert.getCalories() + "\n" + "Price: $" + dessert.getPrice());
				                    
				                }
					      }
					  }
					 
			             

					  // Create a new Menu object with the selected menu items
					  input = txtUserInput.getText();
					  Menu menu = new Menu(input, entree, side, salad, dessert);
					  
					  // Add the new Menu object to the menu list
					  menuListModel.addElement(menu);
				        
				        frmMenu.setTitle(input);
				        frmMenu.setVisible(true);
				        frmUserInput.setVisible(false);
				    }
				});
	
	
				 
			btnDetails.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        
			        Menu selectedMenu = menuList.getSelectedValue();
			      
			        System.out.println(selectedMenu.getItems());

			        // Find the corresponding menu items in the list of items
			        Entree entree = null;
			        Side side = null;
			        Salad salad = null;
			        Dessert dessert = null;
			       
			        
			        for (MenuItem item : items) {
			            if (item instanceof Entree) {
			                entree = (Entree) item;
			            } else if (item instanceof Side) {
			                side = (Side) item;
			            } else if (item instanceof Salad) {
			                salad = (Salad) item;
			            } else if (item instanceof Dessert) {
			                dessert = (Dessert) item;
			            }
			        }

			        	txtEntDes.setText(entree.toString() + "\n" + entree.getDescription() + "\n" + "Calories: " + entree.getCalories() + "\n" + "Price: $" + entree.getPrice());
			        	txtSidDes.setText(side.toString() + "\n" + side.getDescription() + "\n" + "Calories: " + side.getCalories() + "\n" + "Price: $" + side.getPrice()); 
			        	txtSalDes.setText(salad.toString() + "\n" + salad.getDescription() + "\n" + "Calories: " + salad.getCalories() + "\n" + "Price: $" + salad.getPrice());
			        	txtDesDes.setText(dessert.toString() + "\n" + dessert.getDescription() + "\n" + "Calories: " + dessert.getCalories() + "\n" + "Price: $" + dessert.getPrice());
			        

	
			        frmMenu.setTitle(selectedMenu.toString());
			        frmMenu.setVisible(true);
			    }
			});
			
			
			



	}
	
	public static void main(String[] args) {
		MenuManagerGUI mm = new MenuManagerGUI();
	}

}
