import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams{
    public Stream<String> streamOf(List<String> list){
        return list ==null ||list.isEmpty()?Stream.empty() :list.stream();
    }

}
