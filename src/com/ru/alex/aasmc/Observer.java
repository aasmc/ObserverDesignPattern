package com.ru.alex.aasmc;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
