package br.ufg.inf.mf.pratica;

import java.time.LocalDate;
import java.util.Locale;
import java.time.format.TextStyle;

public class Nome {

        public static void main(String[] args) {
        //Locale.setDefault(new Locale("fr", "FR"));
        System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        }
}

