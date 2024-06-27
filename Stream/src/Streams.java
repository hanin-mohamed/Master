import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams{

     Stream<String> streamOf(List<String> list){
        return list ==null ||list.isEmpty()?Stream.empty() :list.stream();
    }
    //Creating a Stream
    Stream stream =Stream.of(23,90,50,55,100);
    IntStream stream1 =IntStream.of(20,-12,10,2,5);
    //Stream Of range
    IntStream str = IntStream.range(1,10); //1 -> 9
    IntStream str2 = IntStream.rangeClosed(1,10); //1 -> 10
    DoubleStream stream2=DoubleStream.of(0.1,0.2,0.3,0.4,0.5);
    //using build method
    Stream<String> str3 = Stream.<String>builder().add("Haneen")
            .add("Mohamed").add("Ahmed").build();

    /*******Collection --> Stream *******/
    //Array -> Stream
    Integer arr[] ={12, 13, 10, 50};
    Stream<Integer> stream4 = Arrays.stream(arr);

    //List -> stream
    List<Integer>list =Arrays.asList(arr);
    Stream<Integer> stream5 = list.stream();

}
