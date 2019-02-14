package com.tadtab.SQLlike;

import java.util.stream.Stream;
import static org.jooq.lambda.Seq.*;
import static org.jooq.lambda.tuple.Tuple.*;

public class SimpleStuff {

	public static void main(String[] args) {
		Stream.of(tuple(1, 1), tuple(2, 2)).forEach(System.out::println);
	}

}
