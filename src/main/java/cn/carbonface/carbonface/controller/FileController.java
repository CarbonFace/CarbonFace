package cn.carbonface.carbonface.controller;

import cn.carbonface.carboncommon.dto.ApiResult;
import cn.carbonface.carboncommon.exception.CarbonException;
import cn.carbonface.carbonface.service.FileService;
import cn.carbonface.carbonsecurity.core.interceptor.NoAuth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


/**
 * classname: FileController
 * Description: file controller for carbonface service
 *
 * @author carbonface <553127022@qq.com>
 * Date: 2021/4/23 15:35
 * @version v1.0
 */
@RestController
@RequestMapping("file")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("upload")
    public ApiResult<String> uploadFile(MultipartFile file,boolean temp) throws IOException, CarbonException {
        String objectId = fileService.uploadFile(file, temp);
        return ApiResult.ok(objectId, "上传成功!");
    }

    @GetMapping("download")
    @NoAuth
    public void downloadFile(String fileId) throws IOException, CarbonException {
        fileService.downloadFile(fileId);
    }
}
