package school.sptech;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class PessoaMapper {

    public List<Pessoa> mapearPessoas(InputStream inputStream) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        List<Pessoa> pessoasDoJson = objectMapper.readValue(inputStream, new TypeReference<List<Pessoa>>() {
        });
        return pessoasDoJson;
    }
}
