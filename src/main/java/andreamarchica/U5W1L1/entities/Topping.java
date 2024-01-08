package andreamarchica.U5W1L1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Topping {
    private String mozzarella = "mozzarella";
    private String pomodoro = "pomodoro";
    private String funghi = "funghi";
    private String prosciutto = "prosciutto";
    private String gorgonzola = "gorgonzola";
    private String stracchino = "stracchino";
    private String salame = "salame";
    private String taleggio = "taleggio";
}

