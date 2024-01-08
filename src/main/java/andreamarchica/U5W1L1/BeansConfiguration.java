package andreamarchica.U5W1L1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import andreamarchica.U5W1L1.entities.*;
import andreamarchica.U5W1L1.entities.Topping;

import java.util.Arrays;

@Configuration
public class BeansConfiguration {


    @Bean
    public Pizza getPizzaProsciuttoEFunghi(Topping pomodoro, Topping mozzarella, Topping prosciutto, Topping funghi) {
        Pizza pizzaProsciuttoEFunghi = new Pizza();
        pizzaProsciuttoEFunghi.setNome("Prosciutto e funghi");
        pizzaProsciuttoEFunghi.setPrezzo(7.99);
        pizzaProsciuttoEFunghi.setCalorie(1203);
        pizzaProsciuttoEFunghi.setIngredienti(Arrays.asList(pomodoro, mozzarella, prosciutto, funghi));
        return pizzaProsciuttoEFunghi;
    }

    @Bean
    public Pizza getPizzaQuattroFormaggi(Topping pomodoro, Topping mozzarella, Topping stracchino, Topping gorgonzola, Topping taleggio) {
        Pizza pizzaQuattroFormaggi = new Pizza();
        pizzaQuattroFormaggi.setNome("Quattro Formaggi");
        pizzaQuattroFormaggi.setPrezzo(7.99);
        pizzaQuattroFormaggi.setCalorie(1203);
        pizzaQuattroFormaggi.setIngredienti(Arrays.asList(pomodoro, mozzarella, stracchino, gorgonzola, taleggio));
        return pizzaQuattroFormaggi;
    }
}
