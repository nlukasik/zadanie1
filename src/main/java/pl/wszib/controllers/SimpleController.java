package pl.wszib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.domain.Samochod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleController {

    private List <Samochod> listSamochod;
        public SimpleController() {

            listSamochod = generateList();

        }



    @GetMapping ("car")

    public String car (Model model ) {
        List<Samochod> list = generateList();
        model.addAttribute("list", listSamochod);
        return "carTemplate";
    }

    @GetMapping ("car/single{index}")

    public String single (Model model) {
        List<Samochod> list = generateList();
        model.addAttribute("list", listSamochod);

    return"singleTemplate";
    }

    @GetMapping("forms")
    public String forms (Model model) {
        model.addAttribute("samochod", new Samochod());
        return "formsTemplate";
    }

    @PostMapping("formsSave")
    public String formsSave(Samochod samochod, Model model) {
        listSamochod.add(samochod);
        return "successTemplate";
    }

    private List <Samochod> generateList (){
        List <Samochod> list = new ArrayList<>();

                Samochod samochod1 = new Samochod();
                samochod1.setMarka("Audi");
                samochod1.setModel("A6");
                samochod1.setRocznik(2010);
                samochod1.setCena(99000);
                samochod1.setPrzebieg(10000);
                list.add(samochod1);



        Samochod samochod2 = new Samochod();
        samochod2.setMarka("Audi");
        samochod2.setModel("A4");
        samochod2.setRocznik(2011);
        samochod2.setCena(99000);
        samochod2.setPrzebieg(40000);
        list.add(samochod2);


        Samochod samochod3 = new Samochod();
        samochod3.setMarka("Audi");
        samochod3.setModel("A1");
        samochod3.setRocznik(2001);
        samochod3.setCena(92000);
        samochod3.setPrzebieg(400);
        list.add(samochod3);

        Samochod samochod4 = new Samochod();
        samochod4.setMarka("Audi");
        samochod4.setModel("A3");
        samochod4.setRocznik(2010);
        samochod4.setCena(7000);
        samochod4.setPrzebieg(90000);
        list.add(samochod4);



        Samochod samochod5 = new Samochod();
        samochod5.setMarka("Peugeot");
        samochod5.setModel("102");
        samochod5.setRocznik(2001);
        samochod5.setCena(6000);
        samochod5.setPrzebieg(240600);
        list.add(samochod5);

        Samochod samochod6 = new Samochod();
        samochod6.setMarka("Citroen");
        samochod6.setModel("C3");
        samochod6.setRocznik(2011);
        samochod6.setCena(29000);
        samochod6.setPrzebieg(40000);
        list.add(samochod6);


        Samochod samochod7 = new Samochod();
        samochod7.setMarka("WV");
        samochod7.setModel("Polo");
        samochod7.setRocznik(2001);
        samochod7.setCena(96000);
        samochod7.setPrzebieg(20000);
        list.add(samochod7);


        Samochod samochod8 = new Samochod();
        samochod8.setMarka("BMW");
        samochod8.setModel("Q5");
        samochod8.setRocznik(2001);
        samochod8.setCena(19000);
        samochod8.setPrzebieg(240600);
        list.add(samochod8);

        Samochod samochod9 = new Samochod();
        samochod9.setMarka("Skoda");
        samochod9.setModel("Fabia");
        samochod9.setRocznik(2014);
        samochod9.setCena(123000);
        samochod9.setPrzebieg(240000);
        list.add(samochod9);


        Samochod samochod10 = new Samochod();
        samochod10.setMarka("Audi");
        samochod10.setModel("A5");
        samochod10.setRocznik(2019);
        samochod10.setCena(123000);
        samochod10.setPrzebieg(200);
        list.add(samochod10);

        return list;
    }



}
