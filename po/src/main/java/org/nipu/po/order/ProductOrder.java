package org.nipu.po.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * TODO: This is autogenerated Java-Doc.
 *
 * @author Nikita_Puzankov
 */
@Document
@Data
@AllArgsConstructor
public class ProductOrder {
    @Id
    private String id;
    private String specificationId;
    private Long quantity;
}
