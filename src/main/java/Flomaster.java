import java.util.Set;
import java.util.stream.Collectors;
// Task 18 Flomaster
public class Flomaster {
        final String color;
        final String taste;

        public Flomaster(String c, String t) {
            color = c;
            taste = t;
        }

        public String getTaste() {
            return taste;
        }

        public String getColor() {
            return color;
        }

        public Boolean isSour() {
            return this.taste.equals("кислый");
        }

    @Override
    // переопределил toString, для вывода для объекта только его цвета, по условию задания
    public String toString() {
        return this.color;
    }

    public static void main(String[] args) {
            Set<Flomaster> flomasterSet = Set.of(
                    new Flomaster("красный", "кислый"),
                    new Flomaster("зелёный", "сладкий"),
                    new Flomaster("жёлтый", "кислый"),
                    new Flomaster("синий", "сладкий"),
                    new Flomaster("оранжевый", "кислый")
            );

            Set<Flomaster> resultSet = getSourFlomaster(flomasterSet);
            System.out.println(resultSet);
        }

        public static Set<Flomaster> getSourFlomaster(Set<Flomaster> flomasterSet) {
            //РЕАЛИЗОВАТЬ МЕТОД
            Set<Flomaster> flomasterSet2 = flomasterSet.stream()
                    .filter(flomaster -> flomaster.getTaste().equals("кислый"))
                    .collect(Collectors.toSet());
            return flomasterSet2 ;
        }
    }
// Необходимо сформировать список цветов кислых фломастеров и вывести его в формате ["цвет1", ..., "цветN"] пример ["красный", "зелёный", "жёлтый"]

