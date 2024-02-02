
public class Main {
    public static void main(String[] args) {
        Warrior fi = new Warrior() ;
        Wizard wi = new Wizard() ;
        System.out.println(wi.isVulnerable());
        System.out.println(fi.damagePoints(wi));

        // Aquí puedes probar el método prepareSpell
        wi.prepareSpell();
        System.out.println(wi.isVulnerable());

        // Llamar de nuevo al método damagePoints después de preparar el hechizo
        System.out.println(fi.damagePoints(wi));
    }
}