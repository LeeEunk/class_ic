package com.class_ic.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.class_ic.utils.QRCodeUtils;
import com.google.zxing.WriterException;

@Controller
public class QRCodeController {

    @RequestMapping("/text2qrcode.do")
    public void text2QRCode(@RequestParam("width") int width,
            @RequestParam("height") int height,
            @RequestParam("text") String text, HttpServletResponse response)
            throws IOException, WriterException {
        ServletOutputStream sos = response.getOutputStream();
        QRCodeUtils.text2QRCode(text, width, height, sos);
        sos.flush();
        sos.close();
    }

}

