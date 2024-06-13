package org.example.ejercicios.medium;

import java.util.List;

public class AddTwoNumbers {
    public ListNode getLastNode(ListNode l1) {
        while (true) {
            if (l1.next != null) {
                l1 = l1.next;
            } else return l1;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // podria revisar los items de cada listnode uno a uno, y sumarlos. no me tengo que olvidar del carry.
        boolean hayCarry = false;
        int sumaParcial = 0;
        ListNode subLista1 = l1;
        ListNode subLista2 = l2;

        ListNode listaResultado = new ListNode();
        while (true) {

            sumaParcial = (((null != subLista1) ? subLista1.val : 0) + ((null != subLista2) ? subLista2.val : 0)); //* ((int) Math.pow(10, cantIteraciones));
            sumaParcial += (hayCarry) ? 1 : 0;
            hayCarry = false;

            if (sumaParcial > 9) {
                sumaParcial -= 10;
                hayCarry = true;
            }


            if (subLista2.next == null && subLista1.next == null && sumaParcial == 0 && !hayCarry)
                break;

            // aca va el armado de la solucion

            getLastNode(listaResultado).next = new ListNode();
            getLastNode(listaResultado).val = sumaParcial;


            subLista2 = (null == subLista2.next) ? new ListNode() : subLista2.next;
            subLista1 = (null == subLista1.next) ? new ListNode() : subLista1.next;

        }
        //System.out.println(sumaParcial);


        return (listaResultado.next == null) ? listaResultado.next : new ListNode(0) ;
    }
}
