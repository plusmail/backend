package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFaq is a Querydsl query type for Faq
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaq extends EntityPathBase<Faq> {

    private static final long serialVersionUID = -1309774619L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFaq faq = new QFaq("faq");

    public final StringPath answer = createString("answer");

    public final QFaqcate faqSortNo;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath questian = createString("questian");

    public final DateTimePath<java.time.Instant> registrationDate = createDateTime("registrationDate", java.time.Instant.class);

    public final DateTimePath<java.time.Instant> updateDate = createDateTime("updateDate", java.time.Instant.class);

    public final NumberPath<Integer> viewNumber = createNumber("viewNumber", Integer.class);

    public final StringPath writingTitle = createString("writingTitle");

    public QFaq(String variable) {
        this(Faq.class, forVariable(variable), INITS);
    }

    public QFaq(Path<? extends Faq> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFaq(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFaq(PathMetadata metadata, PathInits inits) {
        this(Faq.class, metadata, inits);
    }

    public QFaq(Class<? extends Faq> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.faqSortNo = inits.isInitialized("faqSortNo") ? new QFaqcate(forProperty("faqSortNo")) : null;
    }

}

