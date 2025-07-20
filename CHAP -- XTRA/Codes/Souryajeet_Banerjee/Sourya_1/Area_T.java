import java.io.*;/*Class descreption*/
class Area_T/*Class name*/
{   /*Class opens*/
    public static void main(String args[])throws IOException/*Class declaration*/
    {   /*Class declaration opens*/
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));/*BufferedReader Input*/
        int ch,chi;/*Integer Input*/
        double p,b,h,c,k;/*Double Input*/
        System.out.println("Type one   for right      /_  triangle");/*Choosing option*/
        System.out.println();/*Space printing*/
        System.out.println();/*Space printing*/
        System.out.println("Type two   for isocelus   /_  triangle");/*Choosing option*/
        System.out.println();/*Space printing*/
        System.out.println();/*Space printing*/
        System.out.println("Type three for Scalene    /_  triangle");/*Choosing option*/
        System.out.println();/*Space printing*/
        System.out.println();/*Space printing*/
        System.out.println("Type four  for equlateral /_  triangle");/*Choosing option*/
        System.out.println();/*Space printing*/
        System.out.println();/*Space printing*/
        System.out.println();/*Space printing*/
        System.out.println();/*Space printing*/
        ch=Integer.parseInt(br.readLine());/*Integer Variable descreption for Switch case*/
        switch(ch)/*switch case begains*/
        {   /*switch case opens*/
            case 1:/*case one begains*/
            {   /*case opens*/
                System.out.println(" Right /_ triangle");/*Option chose by the user*/
                System.out.print("Enter 1 for perimeter & 2 for area ");/*Choosing option*/
                chi=Integer.parseInt(br.readLine());/*Integer Variable descreption for Switch case*/
                switch(chi)/*switch case loop begains*/
                {   /*switch case opens*/
                    case 1:/*case one begains*/
                    {   /*case opens*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println(" Perimeter of right /_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the perpenticular");/*Value of perpenticular*/
                        p=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the base");/*Value of base*/
                        b=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        h=Math.sqrt((p*p)+(b*b));/*Calculation*/
                        c=p+h+b;/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Perimeter   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    case 2:/*case two begains*/
                    {   /*case opens*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println(" Area of right /_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the perpenticular");/*Value of perpenticular*/
                        p=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the base");/*Value of base*/
                        b=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        c=p*b*0.5;/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Area   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes`*/
                    default :/*If the userenter awrong choise then it will go to default*/
                    System.out.println("Sorry please try again");/*Default answer*/
                }   /*case closes*/
                break;/*discontinew*/
            }   /*case closes*/
            case 2:/*case two begains*/
            {   /*case opens*/
                System.out.println(" Isocelus/_ triangle");/*Option chose by the user*/
                System.out.print("Enter 1 for perimeter & 2 for area ");/*Choosing option*/
                chi=Integer.parseInt(br.readLine());/*Integer Variable descreption for Switch case*/
                switch(chi)/*switch case loop begains*/
                {   /*switch case opens*/
                    case 1:/*case one begains*/
                    {   /*case opens*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Perimeter of isocelus/_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the un-equal side");/*Value of un-equal sider*/
                        p=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the equal side");/*Value of equal sider*/
                        h=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        c=p+h+h;/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Perimeter   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    case 2:/*case two begains*/
                    {   /*switch case opens*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Area of isocelus/_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the un-equal side");/*Value of un-equal sider*/
                        p=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the equal side");/*Value of equal sider*/
                        h=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        c=0.25*p*Math.sqrt(((4*(h*h)-(p*p))));/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Area   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    default :/*If the userenter awrong choise then it will go to default*/
                    System.out.println("Sorry please try again");/*Default answer*/
                }   /*switch case closes*/
                break;/*discontinew*/
            }   /*case closes*/
            case 3:/*case three begains*/
            {   /*case begains*/
                System.out.println(" Scalene/_ triangle");/*Option chose by the user*/
                System.out.print("Enter 1 for perimeter & 2 for area ");/*Choosing option*/
                chi=Integer.parseInt(br.readLine());/*Integer Variable descreption for Switch case*/
                switch(chi)/*switch case loop begains*/
                {   /*switch case begains*/
                    case 1:/*case one begains*/
                    {   /*case begains*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println(" Perimeter of Scalene/_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the un-equal side 1");/*Value of un-equal side*/
                        p=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the un-equal side 2");/*Value of un-equal side*/
                        h=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the un-equal side 3");/*Value of un-equal side*/
                        b=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        c=p+h+b;/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Perimeter   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    case 2:/*case two begains*/
                    {   /*case begains*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println(" Area of Scalene/_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the un-equal side 1");/*Value of un-equal side*/
                        p=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the un-equal side 2");/*Value of un-equal side*/
                        h=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        System.out.println("Enter the un-equal side 3");/*Value of un-equal side*/
                        b=Double.parseDouble(br.readLine());/*Double Variable descreption*/
                        k=(p+h+b)/2;/*Calculation*/
                        c=Math.sqrt((k*(k-p)*(k-h)*(k-b)));/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Area   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    default :/*If the userenter awrong choise then it will go to default*/
                    System.out.println("Sorry please try again");/*Default answer*/
                }   /*Switch case closes*/
                break;/*discontinew*/
            }   /*case closes*/
            case 4:/*case four begains*/
            {   /*case begains*/
                System.out.println(" Equlateral/_ triangle");/*Option chose by the user*/
                System.out.print("Enter 1 for perimeter & 2 for area ");/*Choosing option*/
                chi=Integer.parseInt(br.readLine());/*Integer Variable descreption for Switch case*/
                switch(chi)/*switch case loop begains*/
                {   /*switch case begains*/
                    case 1:/*case one begains*/
                    {   /*case begains*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println(" Perimeter of equlateral/_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the side");/*Value of  side*/
                        p=Double.parseDouble(br.readLine());/*Calculation*/
                        c=p*3;/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Perimeter   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    case 2:/*case two begains*/
                    {   /*case begains*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println(" Area of equlateral/_ triangle");/*Option chose by the user*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Enter the value in meters");/*Value */
                        System.out.println("Enter the side");/*Value of  side*/
                        p=Double.parseDouble(br.readLine());/*Calculation*/
                        c=(Math.sqrt(3)*p*p)/4;/*Calculation*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println();/*Space printing*/
                        System.out.println("Area   = "+c);/*Answer*/
                        break;/*discontinew*/
                    }   /*case closes*/
                    default :/*If the userenter awrong choise then it will go to default*/
                    System.out.println("Sorry please try again");/*Default answer*/
                }   /*switch case closes*/
                break;/*discontinew*/
            }   /*case closes*/
            default :/*If the userenter awrong choise then it will go to default*/
            System.out.println("Sorry please try again");/*Default answer*/
        }   /*switch case closes*/
    }/*Class closes*/
}   /*Class declaration closes*/