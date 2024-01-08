package andreamarchica.U5W1L1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
    private String nome;
    private long calorie;
    private double prezzo;
    private List<Topping> ingredienti;

    public Pizza() {
    }
}
