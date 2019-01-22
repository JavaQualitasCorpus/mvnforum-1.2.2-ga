
-- $Header: /cvsroot/mvnforum/mvnad/sql/mvnad_hsqldb.sql,v 1.3 2008/05/16 08:09:54 minhnn Exp $
-- $Author: minhnn $
-- $Revision: 1.3 $
-- $Date: 2008/05/16 08:09:54 $
-- Database : hsqldb 1.7.2
-- Driver   : org.hsqldb.jdbcDriver
-- Url      : jdbc:hsqldb:file:<database>
--            Example: if your MVNFORUM_HOME is c:\mvnForumHome and you copy the
--            folder hsqldb (in the sql folder) to the mvnForumHome folder,
--            then your url is : 
--            DATABASE_URL = jdbc:hsqldb:file:c:\\mvnForumHome\\hsqldb\\mvnforum
-- User     : sa
-- Password : 

-- DROP TABLE mvnadBanner;
-- DROP TABLE mvnadZone;
-- DROP TABLE mvnadZoneBanner;

CREATE TABLE mvnadBanner
(
    BannerID                        INT                        GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    MemberName                      VARCHAR_IGNORECASE(30)     NOT NULL,
    BannerName                      VARCHAR(50)                NOT NULL,
    BannerDesc                      VARCHAR(250)               NOT NULL,
    BannerAltText                   VARCHAR(250)               NOT NULL,
    BannerMimeType                  VARCHAR(100)               NOT NULL,
    BannerPreText                   VARCHAR(250)               NOT NULL,
    BannerAfterText                 VARCHAR(250)               NOT NULL,
    BannerTargetURL                 VARCHAR(250)               NOT NULL,
    BannerImageURL                  VARCHAR(250)               NOT NULL,
    BannerWidth                     INT                        NOT NULL,
    BannerHeight                    INT                        NOT NULL,
    BannerWeight                    INT                        NOT NULL,
    BannerMaxImpression             INT                        NOT NULL,
    BannerReceivedImpression        INT                        NOT NULL,
    BannerMaxClick                  INT                        NOT NULL,
    BannerReceivedClick             INT                        NOT NULL,
    BannerZonePositionX             INT                        NOT NULL,
    BannerZonePositionY             INT                        NOT NULL,
    BannerStartDate                 TIMESTAMP                  NOT NULL,
    BannerEndDate                   TIMESTAMP                  NOT NULL,
    BannerIsHtml                    INT                        NOT NULL,
    BannerHtmlCode                  LONGVARCHAR                NOT NULL,
    BannerCanTrackClicks            INT                        NOT NULL,
    BannerOption                    INT                        NOT NULL,
    BannerStatus                    INT                        NOT NULL,
    BannerType                      INT                        NOT NULL,
    BannerCreationDate              TIMESTAMP                  NOT NULL,
    BannerModifiedDate              TIMESTAMP                  NOT NULL,
    UNIQUE (MemberName, BannerName)
);

CREATE TABLE mvnadZone 
(
    ZoneID                          INT                        GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    MemberName                      VARCHAR_IGNORECASE(30)     NOT NULL,
    ZoneName                        VARCHAR(150)               NOT NULL,
    ZoneDesc                        VARCHAR(250)               NOT NULL,
    ZoneTargetWindow                VARCHAR(250)               NOT NULL,
    ZoneCellWidth                   INT                        NOT NULL,
    ZoneCellHeight                  INT                        NOT NULL,
    ZoneCellHorizontalCount         INT                        NOT NULL,
    ZoneCellVerticalCount           INT                        NOT NULL,
    ZoneMaxBanners                  INT                        NOT NULL,
    ZoneDirection                   INT                        NOT NULL,
    ZoneMaxImpression               INT                        NOT NULL,
    ZoneReceivedImpression          INT                        NOT NULL,
    ZoneMaxClick                    INT                        NOT NULL,
    ZoneReceivedClick               INT                        NOT NULL,
    ZoneAutoReloadTime              INT                        NOT NULL,
    ZoneOption                      INT                        NOT NULL,
    ZoneStatus                      INT                        NOT NULL,
    ZoneType                        INT                        NOT NULL,
    ZoneCreationDate                TIMESTAMP                  NOT NULL,
    ZoneModifiedDate                TIMESTAMP                  NOT NULL,
    UNIQUE (MemberName, ZoneName)
);

CREATE TABLE mvnadZoneBanner
(
    ZoneID                          INT             NOT NULL,
    BannerID                        INT             NOT NULL,
    RelationCellX                   INT             NOT NULL,
    RelationCellY                   INT             NOT NULL,
    RelationCellOption              INT             NOT NULL,
    RelationWeight                  INT             NOT NULL,
    RelationOption                  INT             NOT NULL,
    RelationStatus                  INT             NOT NULL,
    RelationType                    INT             NOT NULL,
    RelationPublishStartDate        TIMESTAMP       NOT NULL,
    RelationPublishEndDate          TIMESTAMP       NOT NULL,
    RelationCreationDate            TIMESTAMP       NOT NULL,
    RelationModifiedDate            TIMESTAMP       NOT NULL,
    PRIMARY KEY (ZoneID, BannerID)
);

SHUTDOWN COMPACT;