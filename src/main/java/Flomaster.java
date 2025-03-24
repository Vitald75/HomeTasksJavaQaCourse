import java.util.Set;
import java.util.stream.Collectors;

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
    public String toString() {
        return this.color;
    }

    public static void main(String[] args) {
            Set<Flomaster> flomasterSet = Set.of(
                    new Flomaster("красный", "кислый"),
                    new Flomaster("зелёный", "кислый"),
                    new Flomaster("жёлтый", "кислый"),
                    new Flomaster("синий", "сладкий")
            );



            Set<Flomaster> resultSet = getSourFlomaster(flomasterSet);
            System.out.println(resultSet);

        }

        public static Set<Flomaster> getSourFlomaster(Set<Flomaster> flomasterSet) {

            Set<Flomaster> flomasterSet2 = flomasterSet.stream()
                    .filter(flomaster -> (flomaster.getTaste().equals("кислый")))
                    .collect(Collectors.toSet());
                    //.forEach(Flomaster ff::println);

//            System.out.println(flomasterSet2);

//            for (Flomaster it : flomasterSet) {
//                if (it.isSour()) {
//                    System.out.println(it.color);
//                }
//            }
            //РЕАЛИЗОВАТЬ МЕТОД
       return flomasterSet2 ;
    }
    }
// Необходимо сформировать список цветов кислых фломастеров и вывести его в формате ["цвет1", ..., "цветN"] пример ["красный", "зелёный", "жёлтый"]

