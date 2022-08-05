package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFaqcate is a Querydsl query type for Faqcate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaqcate extends EntityPathBase<Faqcate> {

    private static final long serialVersionUID = 161607092L;

    public static final QFaqcate faqcate = new QFaqcate("faqcate");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath sortName = createString("sortName");

    public QFaqcate(String variable) {
        super(Faqcate.class, forVariable(variable));
    }

    public QFaqcate(Path<? extends Faqcate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFaqcate(PathMetadata metadata) {
        super(Faqcate.class, metadata);
    }

}

