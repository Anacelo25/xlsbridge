package com.exceltool.xlsbridge.processamentoarquivos;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ProcessamentoArquivosServico {

    public boolean validarArquivos(MultipartFile file) {
        try (Workbook workbook = WorkbookFactory.create(file.getInputStream())) {
            return true;
        } catch (IOException e) {
            throw new RuntimeException("");
        }
    }
}
