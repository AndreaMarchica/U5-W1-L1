package andreamarchica.U5W1L1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class Drink {
    private String nome;
    private long calorie;
    private double prezzo;
}
