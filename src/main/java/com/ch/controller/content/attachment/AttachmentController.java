package com.ch.controller.content.attachment;

import com.ch.service.AttachmentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/user/attachments")
public class AttachmentController {
//    private final AttachmentService attachmentService;
//    public AttachmentController(AttachmentService attachmentService) {
//        this.attachmentService = attachmentService;
//    }
//    @GetMapping("/")
//  Regix
//    @GetMapping("{id:\\d+}")

    // @PutMapping("{attachmentId:\\d+}")

//    @GetMapping()

// Deletes attachment permanently by id
//    @DeleteMapping("{id:\\d+}")

// @PostMapping("upload")
// AttachmentDTO uploadAttachment(@RequestPart("file") MultipartFile file)


//    @PostMapping(value = "uploads", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    Uploads multi files (Invalid in Swagger UI)
//public List<AttachmentDTO> uploadAttachments(@RequestPart("files") MultipartFile[] files) {
    /**
     for (MultipartFile file : files) {
     // Upload single file
     Attachment attachment = attachmentService.upload(file);
     // Convert and add
     result.add(attachmentService.convertToDto(attachment));
     }
     return result;
     */
}

