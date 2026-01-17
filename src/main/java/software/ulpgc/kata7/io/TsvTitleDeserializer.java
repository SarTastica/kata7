package software.ulpgc.kata7.io;

import software.ulpgc.kata7.model.Title;

public class TsvTitleDeserializer implements TitleDeserializer {
    @Override
    public Title deserialize(String line) {
        String[] fields = line.split("\t");
        if (fields.length > 2) {
            return new Title(fields[0], fields[1], fields[2]);
        }
        return null;
    }
}

