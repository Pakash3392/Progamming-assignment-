package pa4;


/*
 * program description:Design and code a program to allow passengers to book flights. 
 *  
 * Author: Akash Patel
 * Assignment:PA4
 * Date:April 9,2019
 * Class: CSCI 1082
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.DisplayMode;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BookingGui extends JFrame implements ActionListener{
  
  private static final ComboBoxModel SeatNames = null;
 
  private JLabel firstnameLbl = new JLabel("First Name");
  private JLabel lastnameLbl = new JLabel("Last Name");
  private JLabel fromLbl = new JLabel("From");
  private JLabel toLbl = new JLabel("To");
  private JLabel departureLbl = new JLabel("Departure");
  private JLabel returnLbl = new JLabel("Return");
  private JLabel seatLbl = new JLabel("Seat");
  private JLabel consoleLbl = new JLabel ("Console");
  
  private JTextField firstnameTextField  = new JTextField();
  private JTextField lastnameTextField  = new JTextField();
  private JTextField fromTextField  = new JTextField();
  private JTextField toTextField  = new JTextField();
  private JTextField departureTextField  = new JTextField("dd/mm/yyyy");
  private JTextField returnTextField  = new JTextField("dd/mm/yyyy");
  
  private JTextArea area = new JTextArea();
  
  private JButton bookbtn = new JButton("Book");
  private JButton listReservationbtn = new JButton("List Resevation");
  private JButton clearConsolebtn = new JButton("Clear Console");
  
  private JPanel topPanel = new JPanel(new GridLayout(4,4,5,5));
  private JPanel middlePanel = new JPanel(new FlowLayout());
  private JPanel bottomPanel = new JPanel(new BorderLayout());
  
  private JComboBox seatBox;
  
  
  private Passenger pass= new Passenger();
  private Reservation reserv = new Reservation();
  
  
  
  
  private static String [] seatNames = {"1A", "1B", "1C", "1D",
                                       "2A", "2B", "2C", "2D",
                                       "3A", "3B", "3C", "3D",
                                       "4A", "4B", "4C", "4D",
                                       "5A", "5B", "5C", "5D",
                                       "6A", "6B", "6C", "6D",
                                       "7A", "7B", "7C", "7D"};

  
  
  
public BookingGui() {

    setSize(1000,1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(new BorderLayout());
    buildPanelOne();
    buildPanelTwo(); 
    buildPanelThird();
   
    addListner();
    
    
   

  }
public void addPassenger(){
	  //write a method to add a Passanger to the passengers array {
//	  String addPassenger passengers[] = new addPassenger();
		//create a new array with extra room
		//copy the existing array into the new array
		//add the new Passanger to the end of the array
		//assign the variable passengers to the new array so that the new array is saved

//}
  
    
}

  
 private void addListner() {
	 
	 bookbtn.addActionListener(this);
	 listReservationbtn.addActionListener(this);
	 clearConsolebtn.addActionListener(this);
	 
 }

 private void addPanelsToFrame() {
	  
	  add(topPanel);
	  add(middlePanel);
	  add(bottomPanel);
	  
  }

private void buildPanelOne(){

   

    topPanel.add(firstnameLbl); 
    topPanel.add(firstnameTextField);
    
    topPanel.add(lastnameLbl);
    topPanel.add(lastnameTextField);
    
    topPanel.add(fromLbl);
    topPanel.add(fromTextField);
    
    topPanel.add(toLbl);
    topPanel.add(toTextField);
   
    topPanel.add(departureLbl);    
    topPanel.add(departureTextField);
    
    topPanel.add(returnLbl);  
    topPanel.add(returnTextField);
    
    topPanel.add(seatLbl);
    seatBox = new JComboBox(seatNames);
    topPanel.add(seatBox); 
    
    add(topPanel, BorderLayout.NORTH);
  }
  
  private void buildPanelTwo() { 
	  
	  middlePanel.add(bookbtn);
	  middlePanel.add(listReservationbtn);
	  middlePanel.add(clearConsolebtn);
	  
      add(middlePanel, BorderLayout.CENTER);
	  
  }
  private void buildPanelThird() {
	  
	  
	  
	  area.setBounds(10,30,300,300);
      bottomPanel.add(consoleLbl, BorderLayout.NORTH);
	  bottomPanel.add(area);
	 
      bottomPanel.setPreferredSize(new Dimension(400, 400));
	  
      add(bottomPanel, BorderLayout.SOUTH);
   }
  


 public static void main(String[] args){
    
    BookingGui gui = new BookingGui();
    gui.setVisible(true);
 }

 

@Override
  public void actionPerformed(ActionEvent callingbtnInfo) {
	
	 
	 Object source = callingbtnInfo.getSource();
 	 String firstName = firstnameTextField.getText();
 	 String lastName= lastnameTextField.getText();
 	 String from = fromTextField.getText();
 	 String to = toTextField.getText();
 	 String departure = departureTextField.getText();
 	 String return1 = returnTextField.getText();
 	 Toolkit seatNames = seatBox.getToolkit();
 	 
 
 	if (source == bookbtn) {
 		
 	

      //loop through the passenger array. For each passenger:
      		//Check the passenger's reservation.
      		//If there's a reservation conflict
      				//notify the user
      				//exit the method
      //If no conflicts were found, continue with the reservation

      area.setText("Reservation completed for " + firstName +"!\n");
 		}
 	else if (source == listReservationbtn) {
 		area.setText("");
 		area.setText("******Reservation 1------------\n" +"First name:"+ firstName + "\nLast Name:"+ lastName
 				+ "\nFrom:" + from + "\nTo:" + to + "\nDeparture:" +
 				departure + "\nreturn:" + return1 + "\nSeat:" + seatBox);
 		
 		//area.append(reserv.toString()+"\n");
 		
//       	area.append("First Name: " + passengers[i].getFirstName() + "\n");
 	}
  
 		
 	else if (source == clearConsolebtn){
   
 		area.setText(null);
 }
 
 	}
}
  

