import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        logger.log("Запускаем фильтрацию");

        for (int i = 0; i < source.size(); i++) {
            int element = source.get(i);

            if (element < this.threshold) {
                logger.log("Элемент \"" + element + "\" не проходит");
            } else {
                logger.log("Элемент \"" + element + "\" проходит");
                result.add(element);
            }
        }

        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}