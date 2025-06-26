 // Parent class
class Volkswagen {
    void displayBrand() {
        System.out.println("This is a Volkswagen Group brand.");
    }
}

// Child class 1
class Audi extends Volkswagen {
    void showAudiModel() {
        System.out.println("Audi: A6, Q7, e-tron");
    }
}

// Child class 2
class Porsche extends Volkswagen {
    void showPorscheModel() {
        System.out.println("Porsche: 911, Cayenne, Taycan");
    }
}

// Child class 3
class Skoda extends Volkswagen {
    void showSkodaModel() {
        System.out.println("Skoda: Octavia, Superb, Kushaq");
    }

    public static void main(String[] args) {
        Audi a = new Audi();
        a.displayBrand();
        a.showAudiModel();

        Porsche p = new Porsche();
        p.displayBrand();
        p.showPorscheModel();

        Skoda s = new Skoda();
        s.displayBrand();
        s.showSkodaModel();
    }
}

