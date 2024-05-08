package br.com.pucpr.bigdata.atp.implementacao3;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class ImplementsMapper extends Mapper<Object, Text, Text, IntWritable> {
        public void map(Object chave, Text valor, Context context) throws IOException, InterruptedException {
            String linha = valor.toString();
            String[] campos = linha.split(";");

            if (campos.length == 10) {
                context.write(new Text(campos[1]),new IntWritable(1));
            }

        }

}
