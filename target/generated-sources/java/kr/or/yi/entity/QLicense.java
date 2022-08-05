package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLicense is a Querydsl query type for License
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLicense extends EntityPathBase<License> {

    private static final long serialVersionUID = 1407837840L;

    public static final QLicense license = new QLicense("license");

    public final StringPath cafeName = createString("cafeName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath ownerName = createString("ownerName");

    public final StringPath ownerNo = createString("ownerNo");

    public QLicense(String variable) {
        super(License.class, forVariable(variable));
    }

    public QLicense(Path<? extends License> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLicense(PathMetadata metadata) {
        super(License.class, metadata);
    }

}

