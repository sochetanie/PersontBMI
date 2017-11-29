public class PersonTest {
    public static void main(String[] args) {
        Person Sami = new Person();
        Sami.name = "Sami";
        Sami.height = 5.7;
        Sami.weight = 150;
        Person Alla = new Person();
        Alla.name = "Alla";
        Alla.height = 5.3;
        Alla.weight = 145;
        Person Masha = new Person();
        Masha.name = "Masha";
        Masha.height = 5.7;
        Masha.weight = 130;
        Person Chris = new Person();
        Chris.name = "Chris";
        Chris.height = 6;
        Chris.weight = 170;
        Person JP = new Person();
        JP.name = "JP";
        JP.height = 5.5;
        JP.weight = 160;
        Person Andrew = new Person();
        Andrew.name = "Andrew";
        Andrew.height = 5.6;
        Andrew.weight = 180;
        Person Fares = new Person();
        Fares.name = "Fares";
        Fares.height = 5.4;
        Fares.weight = 160;
        Person Noah = new Person();
        Noah.name = "Noah";
        Noah.height = 5.7;
        Noah.weight = 170;
        Person Lana = new Person();
        Lana.name = "Lana";
        Lana.height = 5.4;
        Lana.weight = 120;
        Person Vera = new Person();
        Vera.name = "Vera";
        Vera.height = 5.4;
        Vera.weight = 190;


        Person listOfPeople[] = new Person[10];
        listOfPeople[0] = Sami;
        listOfPeople[1] = Alla;
        listOfPeople[2] = Masha;
        listOfPeople[3] = Chris;
        listOfPeople[4] = JP;
        listOfPeople[5] = Andrew;
        listOfPeople[6] = Fares;
        listOfPeople[7] = Noah;
        listOfPeople[8] = Lana;
        listOfPeople[9] = Vera;



        for(int i=0; i < listOfPeople.length; i++) {
            listOfPeople[i].BMI = (listOfPeople[i].weight * 703 / (listOfPeople[i].height*12 * listOfPeople[i].height*12));
//            System.out.println(listOfPeople[i].BMI);
        }

        for(int j=0; j < listOfPeople.length; j++) {
            if (listOfPeople[j].BMI>=18.5 && listOfPeople[j].BMI<=24.9) {
                System.out.println("Weight of "+listOfPeople[j].name+ " is Normal");
            } else if (listOfPeople[j].BMI>29.9) {
                System.out.println(listOfPeople[j].name+ " is Obese");
            }
        }


    }
}