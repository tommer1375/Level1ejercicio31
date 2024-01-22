import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class n3jercicio1 {

    public static void main(String[] args) {

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        // Crear ArrayList y agregar objetos Month
        ArrayList<Month> monthList = new ArrayList<>();
        monthList.add(january);
        monthList.add(february);
        monthList.add(march);
        monthList.add(april);
        monthList.add(may);
        monthList.add(june);
        monthList.add(july);
        monthList.add(september);
        monthList.add(october);
        monthList.add(november);
        monthList.add(december);



        Month agost = new Month("Agost");
        int posicion = monthList.indexOf(september);
        monthList.add(posicion, agost);

        System.out.println("Añadimos Agost y verificamos que tiene el luar correcto:");
        for (int i = 0; i < monthList.size(); i++) {
            Month month = monthList.get(i);
            System.out.println(month.getName());
        }
        HashSet <Month> listaMeses = new HashSet<Month>();
        listaMeses.add(january);
        listaMeses.add(february);
        listaMeses.add(march);
        listaMeses.add(april);
        listaMeses.add(may);
        listaMeses.add(june);
        listaMeses.add(july);
        listaMeses.add(agost);
        listaMeses.add(september);
        listaMeses.add(october);
        listaMeses.add(november);
        listaMeses.add(december);
        listaMeses.add(december); //añadimos otra vez diciembre para verificar que no permite duplicados.
        System.out.println();

        System.out.println("Hemos creado el HashSet, añadido Diciembre 2 veces y no sale repetido");
        for (Month month: listaMeses){
            System.out.println(month.getName());

        }

        System.out.println();

        Iterator<Month> iteradorMes=listaMeses.iterator();
        while (iteradorMes.hasNext()){
            System.out.println(iteradorMes.next().getName());
        }

    }
}
