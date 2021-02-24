package homeWork21.hW2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Model<String> stringModel = new Model<>("RSPV");
        Optional<Model<String>> modelOptional = Optional.of(stringModel);
        Optional<Model<String>> optionalEmptyModel = Optional.ofNullable(stringModel);
        Optional<Model<String>> optionalEmpty = Optional.empty();


        System.out.println("Model: " + modelOptional.get());
        System.out.println("Empty Model: " + optionalEmptyModel.get());
//        System.out.println("Empty: " + optionalEmpty.get());

        Optional<Model<String>> optionalName = Optional.of(new Model<String>("TIPES"));

        optionalName.ifPresent(System.out::println);
        optionalName.ifPresent(model -> System.out.println(optionalName.get()));

        Optional<Model<String>> optionalName1 = Optional.of(new Model<String>("TIPES"));
        System.out.println(optionalName1.orElse(new Model<String>("empty")));

        Optional<Model<String>> emptys = Optional.empty();
        System.out.println(emptys.orElseGet(() -> new Model<String>("empty")));

//        System.out.println(emptys.orElseThrow(() -> new NullPointerException()));


        Optional<String> optionalName3 = Optional.of("TIPES");
        System.out.println(optionalName3.map(String::toLowerCase).get());

    }
}
