class TrianguloRetangulo {

    double h;
    double c1;
    double c2;

    double calculaHipotenusa() {
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return h;
    }

    double calculaArea() {
        return (c1 * c2) / 2;
    }
}