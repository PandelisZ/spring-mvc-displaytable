package shoes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ShoeController {

    @RequestMapping("/shoes")
    public String shoe(Model model) {
        // Shoe ["Make", "Model", int[sizes], double(Rating)]
        model.addAttribute("shoes", new Shoe[]{ new Shoe("Shoes Inc.", "Flat Attack", new int[]{1,5,2,7,6}, 3.4), new Shoe("Shoes Inc.", "Adios", new int[]{8,4}, 1.2), new Shoe("Feet Fleet", "J - Swish", new int[]{2,6,1}, 8.0), new Shoe("Joes Toes", "Mike Airs", new int[]{2,3,4,8,9}, 5.4), new Shoe("Tims Trainers", "Crepe", new int[]{7}, 8.1), new Shoe("Tims Trainers", "The David", new int[]{4,6,2,7}, 4.6), });
        return "shoes";
    }

}
