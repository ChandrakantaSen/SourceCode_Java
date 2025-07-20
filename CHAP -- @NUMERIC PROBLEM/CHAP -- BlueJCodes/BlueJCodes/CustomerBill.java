import java.io.*;

class CustomerBill
{
    public static void main(String args[])throws IOException
    {
        int ch;
        double rates=0.0,quantity=0.0,billAmt=0.0;
        String custName;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--- Contents ---");
        System.out.println("Press 1: For Cornflakes");
        System.out.println("Press 2: For Oats");
        System.out.println("Press 3: For Rice");
        System.out.println("Press 4: For Pulses");
        System.out.println("Press 5: For Soaps");
        System.out.println("Press 6: For Gram Flour");
        System.out.println();

        System.out.println("Enter the choice of products");
        ch = Integer.parseInt(br.readLine());

        switch(ch)
        {
            case 1:
            System.out.println();
            System.out.print("Enter the customer name: ");
            custName = br.readLine();
            System.out.print("Enter the rates: ");
            rates = Double.parseDouble(br.readLine());
            System.out.print("Enter the quantity: ");
            quantity = Double.parseDouble(br.readLine());

            billAmt = (rates * quantity);

            System.out.println();
            System.out.println("Customer name: " + custName);
            System.out.println("Product name: " + "Cornflakes");
            System.out.println("Total Bill Amount: " + billAmt);
            break;
            case 2:
            System.out.println();
            System.out.print("Enter the customer name: ");
            custName = br.readLine();
            System.out.print("Enter the rates: ");
            rates = Double.parseDouble(br.readLine());
            System.out.print("Enter the quantity: ");
            quantity = Double.parseDouble(br.readLine());

            billAmt = (rates * quantity);

            System.out.println();
            System.out.println("Customer name: " + custName);
            System.out.println("Product name: " + "Oats");
            System.out.println("Total Bill Amount: " + billAmt);
            break;
            case 3:
            System.out.println();
            System.out.print("Enter the customer name: ");
            custName = br.readLine();
            System.out.print("Enter the rates: ");
            rates = Double.parseDouble(br.readLine());
            System.out.print("Enter the quantity: ");
            quantity = Double.parseDouble(br.readLine());

            billAmt = (rates * quantity);

            System.out.println();
            System.out.println("Customer name: " + custName);
            System.out.println("Product name: " + "Rice");
            System.out.println("Total Bill Amount: " + billAmt);
            break;
            case 4:
            System.out.println();
            System.out.print("Enter the customer name: ");
            custName = br.readLine();
            System.out.print("Enter the rates: ");
            rates = Double.parseDouble(br.readLine());
            System.out.print("Enter the quantity: ");
            quantity = Double.parseDouble(br.readLine());

            billAmt = (rates * quantity);

            System.out.println();
            System.out.println("Customer name: " + custName);
            System.out.println("Product name: " + "Pulses");
            System.out.println("Total Bill Amount: " + billAmt);
            break;
            case 5: 
            System.out.println();
            System.out.print("Enter the customer name: ");
            custName = br.readLine();
            System.out.print("Enter the rates: ");
            rates = Double.parseDouble(br.readLine());
            System.out.print("Enter the quantity: ");
            quantity = Double.parseDouble(br.readLine());

            billAmt = (rates * quantity);

            System.out.println();
            System.out.println("Customer name: " + custName);
            System.out.println("Product name: " + "Soaps");
            System.out.println("Total Bill Amount: " + billAmt);
            break;
            case 6:
            System.out.println();
            System.out.print("Enter the customer name: ");
            custName = br.readLine();
            System.out.print("Enter the rates: ");
            rates = Double.parseDouble(br.readLine());
            System.out.print("Enter the quantity: ");
            quantity = Double.parseDouble(br.readLine());

            billAmt = (rates * quantity);

            System.out.println();
            System.out.println("Customer name: " + custName);
            System.out.println("Product name: " + "Gram Flour");
            System.out.println("Total Bill Amount: " + billAmt);
            break;
            default:
            System.out.println("---- Wrong Input ----");
        }
    }
}