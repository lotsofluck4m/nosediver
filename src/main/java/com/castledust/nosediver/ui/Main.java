package com.castledust.nosediver.ui;

import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;

@SpringView(name = "")
@Scope(value = "prototype")
public class Main extends VerticalLayout implements SecureView {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public Main() {

    }

    @Override
    public boolean needAuth() {
        return true;
    }
}
