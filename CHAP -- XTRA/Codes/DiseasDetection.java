import java.io.*;
class usediagnose1
{
    public static void main(String args[]) throws IOException
    {
        String d1="Hypertension";
        String d2="Diabetes";
        String s1[]={"High BP", "Obesity", "Breathlessness", "Chest pain", "High pulse rate"}; //symptoms
        String s2[]={"Poor vision", "Belly fat", "Unusual thirst", "Fatigue", "Numbness"};
       
        diagnose1 ob=new diagnose1(d1,d2,s1,s2);
        diagnose1 ob2=new diagnose1();
        ob.new_diagnose(100, "Miss. Pooja");
        ob.ask();
        String rd=ob.return_disease();
        String nm=ob.return_name();
        System.out.println("Wish you speedy recovery "+nm+ " from the disease: " +rd);
       
       
    }
}
       


class diagnose1
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    int patient_id;
    String patient_name;
    String disease1,disease2;
    String symp1[]=new String[5];
    String symp2[]=new String[5];
    String disease_detected;
    int i;
    diagnose1() //default constructor
    {
        patient_id=0;
        patient_name="";
    }
   
    diagnose1(String dis1, String dis2, String s1[], String s2[])  //parametrised constructor
    {
       
        disease1=dis1;
        disease2=dis2;
       
        for(i=0;i<5;i++)
        {
            symp1[i]=s1[i];
            symp2[i]=s2[i];
        }
       
    }
   
   
    void new_diagnose(int id, String n)
    {
        patient_id=id;
        patient_name=n;
    }
   
    void ask()throws IOException
    {
        System.out.println("Enter any two symptoms of your illness out of the list of symptoms");
        System.out.println(" High BP,Obesity,Breathlessness,Chest pain,High pulse rate,\n Poor vision, Belly fat,Unusual thirst,Fatigue,Numbness");
        String one=br.readLine();
        String two=br.readLine();
        int j,k;
        int c1=0, c2=0;   //counters for symptoms
        for(j=0;j<5;j++)
        {
            if(symp1[j].equalsIgnoreCase(one))
            {
                c1++;
            }
            if(symp1[j].equalsIgnoreCase(two))
            {
                c1++;
            }
        }
        for(k=0;k<5;k++)
        {
            if(symp2[k].equalsIgnoreCase(one))
            {
                c2++;
            }
            if(symp2[k].equalsIgnoreCase(two))
            {
                c2++;
            }
        }
       
        if(c1==2)   //disease detected if any 2 symptoms match
        {
            disease_detected=disease1;
        }
        else if(c2==2)
        {
            disease_detected=disease2;
        }
        else
        {
       
            disease_detected="NONE";
        }
       
        System.out.println("Detected disease : " +disease_detected);
        display_details();
    }
    private void display_details()
    {
             if(disease_detected==disease1)
             {
                 System.out.println("Remedies for Hypertension are: Consume less salt, Lose weight, Exercise daily, Do not take stress");
             }
             else if(disease_detected==disease2)
             {
                 System.out.println("Remedies for Diabetes are: Consume less sugar, Lose excess weight, Brisk walk daily");
             }
             else
            
             {
                 System.out.println("You are fit and fine !");
             }
    } 
    String return_disease()

    {

        return disease_detected;

    }

    String return_name()

    {

        return patient_name;

    }
}
           
