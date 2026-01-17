package software.ulpgc.kata7.io;

import software.ulpgc.kata7.model.Title;

public interface TitleDeserializer {
    Title deserialize(String line);
}

