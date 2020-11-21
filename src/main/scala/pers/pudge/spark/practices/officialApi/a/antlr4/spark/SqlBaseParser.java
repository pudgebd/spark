// Generated from SqlBase.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.spark;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADD=11, AFTER=12, ALL=13, ALTER=14, ANALYZE=15, AND=16, ANTI=17, 
		ANY=18, ARCHIVE=19, ARRAY=20, AS=21, ASC=22, AT=23, AUTHORIZATION=24, 
		BETWEEN=25, BOTH=26, BUCKET=27, BUCKETS=28, BY=29, CACHE=30, CASCADE=31, 
		CASE=32, CAST=33, CHANGE=34, CHECK=35, CLEAR=36, CLUSTER=37, CLUSTERED=38, 
		CODEGEN=39, COLLATE=40, COLLECTION=41, COLUMN=42, COLUMNS=43, COMMENT=44, 
		COMMIT=45, COMPACT=46, COMPACTIONS=47, COMPUTE=48, CONCATENATE=49, CONSTRAINT=50, 
		COST=51, CREATE=52, CROSS=53, CUBE=54, CURRENT=55, CURRENT_DATE=56, CURRENT_TIME=57, 
		CURRENT_TIMESTAMP=58, CURRENT_USER=59, DATA=60, DATABASE=61, DATABASES=62, 
		DAY=63, DAYS=64, DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, 
		DESC=69, DESCRIBE=70, DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, 
		DISTRIBUTE=75, DROP=76, ELSE=77, END=78, ESCAPED=79, EXCEPT=80, EXCHANGE=81, 
		EXISTS=82, EXPLAIN=83, EXPORT=84, EXTENDED=85, EXTERNAL=86, EXTRACT=87, 
		FALSE=88, FETCH=89, FIELDS=90, FILEFORMAT=91, FIRST=92, FIRST_VALUE=93, 
		FOLLOWING=94, FOR=95, FOREIGN=96, FORMAT=97, FORMATTED=98, FROM=99, FULL=100, 
		FUNCTION=101, FUNCTIONS=102, GLOBAL=103, GRANT=104, GROUP=105, GROUPING=106, 
		HAVING=107, HOUR=108, HOURS=109, IF=110, IGNORE=111, IMPORT=112, IN=113, 
		INDEX=114, INDEXES=115, INNER=116, INPATH=117, INPUTFORMAT=118, INSERT=119, 
		INTERSECT=120, INTERVAL=121, INTO=122, IS=123, ITEMS=124, JOIN=125, KEYS=126, 
		LAST=127, LAST_VALUE=128, LATERAL=129, LAZY=130, LEADING=131, LEFT=132, 
		LIKE=133, LIMIT=134, LINES=135, LIST=136, LOAD=137, LOCAL=138, LOCATION=139, 
		LOCK=140, LOCKS=141, LOGICAL=142, LIFECYCLE=143, MACRO=144, MAP=145, MICROSECOND=146, 
		MICROSECONDS=147, MILLISECOND=148, MILLISECONDS=149, MINUTE=150, MINUTES=151, 
		MONTH=152, MONTHS=153, MSCK=154, HIDDEN_CHANNEL=155, NAMESPACE=156, NAMESPACES=157, 
		NATURAL=158, NO=159, NOT=160, NULL=161, NULLS=162, OF=163, ON=164, ONLY=165, 
		OPTION=166, OPTIONS=167, OR=168, ORDER=169, OUT=170, OUTER=171, OUTPUTFORMAT=172, 
		OVER=173, OVERLAPS=174, OVERLAY=175, OVERWRITE=176, PARTITION=177, PARTITIONED=178, 
		PARTITIONS=179, PERCENTLIT=180, PIVOT=181, PLACING=182, POSITION=183, 
		PRECEDING=184, PRIMARY=185, PRINCIPALS=186, PURGE=187, QUERY=188, RANGE=189, 
		RECORDREADER=190, RECORDWRITER=191, RECOVER=192, REDUCE=193, REFERENCES=194, 
		REFRESH=195, RENAME=196, REPAIR=197, REPLACE=198, RESET=199, RESPECT=200, 
		RESTRICT=201, REVOKE=202, RIGHT=203, RLIKE=204, ROLE=205, ROLES=206, ROLLBACK=207, 
		ROLLUP=208, ROW=209, ROWS=210, SCHEMA=211, SECOND=212, SECONDS=213, SELECT=214, 
		SEMI=215, SEPARATED=216, SERDE=217, SERDEPROPERTIES=218, SESSION_USER=219, 
		SET=220, SETMINUS=221, SETS=222, SHOW=223, SKEWED=224, SOME=225, SORT=226, 
		SORTED=227, START=228, STATISTICS=229, STORED=230, STRATIFY=231, STRUCT=232, 
		SUBSTR=233, SUBSTRING=234, TABLE=235, TABLES=236, TABLESAMPLE=237, TBLPROPERTIES=238, 
		TEMPORARY=239, TERMINATED=240, THEN=241, TO=242, TOUCH=243, TRAILING=244, 
		TRANSACTION=245, TRANSACTIONS=246, TRANSFORM=247, TRIM=248, TRUE=249, 
		TRUNCATE=250, TYPE=251, UNARCHIVE=252, UNBOUNDED=253, UNCACHE=254, UNION=255, 
		UNIQUE=256, UNKNOWN=257, UNLOCK=258, UNSET=259, UPDATE=260, USE=261, USER=262, 
		USING=263, VALUES=264, VIEW=265, WEEK=266, WEEKS=267, WHEN=268, WHERE=269, 
		WINDOW=270, WITH=271, YEAR=272, YEARS=273, EQ=274, NSEQ=275, NEQ=276, 
		NEQJ=277, LT=278, LTE=279, GT=280, GTE=281, PLUS=282, MINUS=283, ASTERISK=284, 
		SLASH=285, PERCENT=286, DIV=287, TILDE=288, AMPERSAND=289, PIPE=290, CONCAT_PIPE=291, 
		HAT=292, STRING=293, BIGINT_LITERAL=294, SMALLINT_LITERAL=295, TINYINT_LITERAL=296, 
		INTEGER_VALUE=297, DECIMAL_VALUE=298, DOUBLE_LITERAL=299, BIGDECIMAL_LITERAL=300, 
		IDENTIFIER=301, BACKQUOTED_IDENTIFIER=302, SIMPLE_COMMENT=303, BRACKETED_EMPTY_COMMENT=304, 
		BRACKETED_COMMENT=305, WS=306, UNRECOGNIZED=307;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_myCreateTableStmt = 7, 
		RULE_statement = 8, RULE_unsupportedHiveNativeCommands = 9, RULE_createTableHeader = 10, 
		RULE_replaceTableHeader = 11, RULE_bucketSpec = 12, RULE_skewSpec = 13, 
		RULE_locationSpec = 14, RULE_query = 15, RULE_insertInto = 16, RULE_partitionSpecLocation = 17, 
		RULE_partitionSpec = 18, RULE_partitionVal = 19, RULE_database = 20, RULE_describeFuncName = 21, 
		RULE_describeColName = 22, RULE_ctes = 23, RULE_namedQuery = 24, RULE_tableProvider = 25, 
		RULE_tablePropertyList = 26, RULE_tableProperty = 27, RULE_tablePropertyKey = 28, 
		RULE_tablePropertyValue = 29, RULE_constantList = 30, RULE_nestedConstantList = 31, 
		RULE_createFileFormat = 32, RULE_fileFormat = 33, RULE_storageHandler = 34, 
		RULE_resource = 35, RULE_dmlStatementNoWith = 36, RULE_queryOrganization = 37, 
		RULE_multiInsertQueryBody = 38, RULE_queryTerm = 39, RULE_queryPrimary = 40, 
		RULE_sortItem = 41, RULE_fromStatement = 42, RULE_fromStatementBody = 43, 
		RULE_querySpecification = 44, RULE_transformClause = 45, RULE_selectClause = 46, 
		RULE_setClause = 47, RULE_assign = 48, RULE_whereClause = 49, RULE_havingClause = 50, 
		RULE_hint = 51, RULE_hintStatement = 52, RULE_fromClause = 53, RULE_aggregationClause = 54, 
		RULE_groupingSet = 55, RULE_pivotClause = 56, RULE_pivotColumn = 57, RULE_pivotValue = 58, 
		RULE_lateralView = 59, RULE_setQuantifier = 60, RULE_relation = 61, RULE_joinRelation = 62, 
		RULE_joinType = 63, RULE_joinCriteria = 64, RULE_sample = 65, RULE_sampleMethod = 66, 
		RULE_identifierList = 67, RULE_identifierSeq = 68, RULE_orderedIdentifierList = 69, 
		RULE_orderedIdentifier = 70, RULE_identifierCommentList = 71, RULE_identifierComment = 72, 
		RULE_relationPrimary = 73, RULE_inlineTable = 74, RULE_functionTable = 75, 
		RULE_tableAlias = 76, RULE_rowFormat = 77, RULE_multipartIdentifier = 78, 
		RULE_tableIdentifier = 79, RULE_functionIdentifier = 80, RULE_namedExpression = 81, 
		RULE_namedExpressionSeq = 82, RULE_transformList = 83, RULE_transform = 84, 
		RULE_transformArgument = 85, RULE_expression = 86, RULE_booleanExpression = 87, 
		RULE_predicate = 88, RULE_valueExpression = 89, RULE_primaryExpression = 90, 
		RULE_constant = 91, RULE_comparisonOperator = 92, RULE_arithmeticOperator = 93, 
		RULE_predicateOperator = 94, RULE_booleanValue = 95, RULE_interval = 96, 
		RULE_intervalField = 97, RULE_intervalValue = 98, RULE_intervalUnit = 99, 
		RULE_colPosition = 100, RULE_dataType = 101, RULE_qualifiedColTypeWithPositionList = 102, 
		RULE_qualifiedColTypeWithPosition = 103, RULE_colTypeList = 104, RULE_colType = 105, 
		RULE_complexColTypeList = 106, RULE_complexColType = 107, RULE_whenClause = 108, 
		RULE_windowClause = 109, RULE_namedWindow = 110, RULE_windowSpec = 111, 
		RULE_windowFrame = 112, RULE_frameBound = 113, RULE_qualifiedNameList = 114, 
		RULE_qualifiedName = 115, RULE_errorCapturingIdentifier = 116, RULE_errorCapturingIdentifierExtra = 117, 
		RULE_identifier = 118, RULE_strictIdentifier = 119, RULE_quotedIdentifier = 120, 
		RULE_number = 121, RULE_ansiNonReserved = 122, RULE_strictNonReserved = 123, 
		RULE_nonReserved = 124;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "myCreateTableStmt", 
			"statement", "unsupportedHiveNativeCommands", "createTableHeader", "replaceTableHeader", 
			"bucketSpec", "skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
			"partitionSpec", "partitionVal", "database", "describeFuncName", "describeColName", 
			"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "assign", "whereClause", 
			"havingClause", "hint", "hintStatement", "fromClause", "aggregationClause", 
			"groupingSet", "pivotClause", "pivotColumn", "pivotValue", "lateralView", 
			"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
			"sample", "sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
			"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
			"inlineTable", "functionTable", "tableAlias", "rowFormat", "multipartIdentifier", 
			"tableIdentifier", "functionIdentifier", "namedExpression", "namedExpressionSeq", 
			"transformList", "transform", "transformArgument", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"intervalField", "intervalValue", "intervalUnit", "colPosition", "dataType", 
			"qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", "colTypeList", 
			"colType", "complexColTypeList", "complexColType", "whenClause", "windowClause", 
			"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedNameList", 
			"qualifiedName", "errorCapturingIdentifier", "errorCapturingIdentifierExtra", 
			"identifier", "strictIdentifier", "quotedIdentifier", "number", "ansiNonReserved", 
			"strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
			"':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DAY'", "'DAYS'", "'DBPROPERTIES'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DROP'", "'ELSE'", "'END'", 
			"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
			"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
			"'FILEFORMAT'", "'FIRST'", "'FIRST_VALUE'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
			"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", 
			"'HOURS'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LAST_VALUE'", 
			"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'LIFECYCLE'", "'MACRO'", "'MAP'", "'MICROSECOND'", "'MICROSECONDS'", 
			"'MILLISECOND'", "'MILLISECONDS'", "'MINUTE'", "'MINUTES'", "'MONTH'", 
			"'MONTHS'", "'MSCK'", "'hiddenChannel'", "'NAMESPACE'", "'NAMESPACES'", 
			"'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", "'ON'", "'ONLY'", 
			"'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", 
			"'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", 
			"'PARTITIONS'", "'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", 
			"'PRIMARY'", "'PRINCIPALS'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", 
			"'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", 
			"'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", 
			"'REVOKE'", "'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", 
			"'ROW'", "'ROWS'", "'SCHEMA'", "'SECOND'", "'SECONDS'", "'SELECT'", "'SEMI'", 
			"'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", 
			"'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", 
			"'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", 
			"'SUBSTRING'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", 
			null, "'TERMINATED'", "'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", 
			"'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", 
			"'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", 
			"'VIEW'", "'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
			"'YEAR'", "'YEARS'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", 
			"'||'", "'^'", null, null, null, null, null, null, null, null, null, 
			null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ADD", 
			"AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DAY", "DAYS", "DBPROPERTIES", "DEFINED", 
			"DELETE", "DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", 
			"DISTINCT", "DISTRIBUTE", "DROP", "ELSE", "END", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILEFORMAT", "FIRST", "FIRST_VALUE", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", 
			"HOURS", "IF", "IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", 
			"INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", 
			"ITEMS", "JOIN", "KEYS", "LAST", "LAST_VALUE", "LATERAL", "LAZY", "LEADING", 
			"LEFT", "LIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", 
			"LOCK", "LOCKS", "LOGICAL", "LIFECYCLE", "MACRO", "MAP", "MICROSECOND", 
			"MICROSECONDS", "MILLISECOND", "MILLISECONDS", "MINUTE", "MINUTES", "MONTH", 
			"MONTHS", "MSCK", "HIDDEN_CHANNEL", "NAMESPACE", "NAMESPACES", "NATURAL", 
			"NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", 
			"OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", 
			"OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", 
			"REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", "RESET", 
			"RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROW", "ROWS", "SCHEMA", "SECOND", "SECONDS", "SELECT", "SEMI", 
			"SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", 
			"SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", 
			"STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", 
			"TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", 
			"TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", 
			"TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", 
			"UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", 
			"VALUES", "VIEW", "WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", "WITH", 
			"YEAR", "YEARS", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", 
			"PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, ANSI SQL parsing mode is enabled.
	   */
	  public boolean ansi = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			statement();
			setState(251);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			namedExpression();
			setState(254);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			tableIdentifier();
			setState(257);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			multipartIdentifier();
			setState(260);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			functionIdentifier();
			setState(263);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			dataType();
			setState(266);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			colTypeList();
			setState(269);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyCreateTableStmtContext extends ParserRuleContext {
		public Token myStmt;
		public QualifiedColTypeWithPositionListContext columns;
		public Token tableComment;
		public Token lifecycleNum;
		public Token hiddenChannel;
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public List<QualifiedColTypeWithPositionListContext> qualifiedColTypeWithPositionList() {
			return getRuleContexts(QualifiedColTypeWithPositionListContext.class);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList(int i) {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> LIFECYCLE() { return getTokens(SqlBaseParser.LIFECYCLE); }
		public TerminalNode LIFECYCLE(int i) {
			return getToken(SqlBaseParser.LIFECYCLE, i);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode HIDDEN_CHANNEL() { return getToken(SqlBaseParser.HIDDEN_CHANNEL, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public MyCreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myCreateTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMyCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMyCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMyCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyCreateTableStmtContext myCreateTableStmt() throws RecognitionException {
		MyCreateTableStmtContext _localctx = new MyCreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_myCreateTableStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((MyCreateTableStmtContext)_localctx).myStmt = match(CREATE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(272);
				match(TEMPORARY);
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(275);
				match(EXTERNAL);
				}
			}

			setState(278);
			match(TABLE);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(279);
				match(IF);
				setState(280);
				match(NOT);
				setState(281);
				match(EXISTS);
				}
				break;
			}
			setState(284);
			multipartIdentifier();
			setState(285);
			match(T__0);
			setState(286);
			((MyCreateTableStmtContext)_localctx).columns = qualifiedColTypeWithPositionList();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(287);
					match(T__1);
					setState(288);
					((MyCreateTableStmtContext)_localctx).columns = qualifiedColTypeWithPositionList();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(294);
			match(T__2);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==LIFECYCLE) {
				{
				setState(299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMENT:
					{
					{
					setState(295);
					match(COMMENT);
					setState(296);
					((MyCreateTableStmtContext)_localctx).tableComment = match(STRING);
					}
					}
					break;
				case LIFECYCLE:
					{
					setState(297);
					match(LIFECYCLE);
					setState(298);
					((MyCreateTableStmtContext)_localctx).lifecycleNum = match(INTEGER_VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDDEN_CHANNEL) {
				{
				setState(304);
				((MyCreateTableStmtContext)_localctx).hiddenChannel = match(HIDDEN_CHANNEL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteFromTableContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public Token comment;
		public TablePropertyListContext tableProps;
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends StatementContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public IdentifierListContext partitionColumnNames;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabaseLocationContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public SetDatabaseLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public QualifiedNameContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public ErrorCapturingIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableColumnContext extends StatementContext {
		public Token comment;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public AlterTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPartitionLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetPartitionLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetPartitionLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetPartitionLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetPartitionLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public QualifiedNameListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(308);
					ctes();
					}
				}

				setState(311);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(USE);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(313);
					match(NAMESPACE);
					}
					break;
				}
				setState(316);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(CREATE);
				setState(318);
				database();
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(319);
					match(IF);
					setState(320);
					match(NOT);
					setState(321);
					match(EXISTS);
					}
					break;
				}
				setState(324);
				((CreateDatabaseContext)_localctx).db = errorCapturingIdentifier();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(331);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(325);
						match(COMMENT);
						setState(326);
						((CreateDatabaseContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case LOCATION:
						{
						setState(327);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(328);
						match(WITH);
						setState(329);
						match(DBPROPERTIES);
						setState(330);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(ALTER);
				setState(337);
				database();
				setState(338);
				((SetDatabasePropertiesContext)_localctx).db = errorCapturingIdentifier();
				setState(339);
				match(SET);
				setState(340);
				match(DBPROPERTIES);
				setState(341);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetDatabaseLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				match(ALTER);
				setState(344);
				database();
				setState(345);
				((SetDatabaseLocationContext)_localctx).db = errorCapturingIdentifier();
				setState(346);
				match(SET);
				setState(347);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(349);
				match(DROP);
				setState(350);
				database();
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(351);
					match(IF);
					setState(352);
					match(EXISTS);
					}
					break;
				}
				setState(355);
				((DropDatabaseContext)_localctx).db = errorCapturingIdentifier();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(356);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				match(SHOW);
				setState(360);
				match(DATABASES);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(361);
						match(LIKE);
						}
					}

					setState(364);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(367);
				match(SHOW);
				setState(368);
				match(NAMESPACES);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(369);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(370);
					multipartIdentifier();
					}
				}

				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(373);
						match(LIKE);
						}
					}

					setState(376);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(379);
				createTableHeader();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(380);
					match(T__0);
					setState(381);
					colTypeList();
					setState(382);
					match(T__2);
					}
				}

				setState(386);
				tableProvider();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LOCATION - 139)) | (1L << (OPTIONS - 139)) | (1L << (PARTITIONED - 139)))) != 0) || _la==TBLPROPERTIES) {
					{
					setState(398);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(387);
						match(OPTIONS);
						setState(388);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(389);
						match(PARTITIONED);
						setState(390);
						match(BY);
						setState(391);
						((CreateTableContext)_localctx).partitioning = transformList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(392);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(393);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(394);
						match(COMMENT);
						setState(395);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(396);
						match(TBLPROPERTIES);
						setState(397);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REDUCE - 193)) | (1L << (SELECT - 193)) | (1L << (TABLE - 193)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(403);
						match(AS);
						}
					}

					setState(406);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(409);
				createTableHeader();
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(410);
					match(T__0);
					setState(411);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(412);
					match(T__2);
					}
					break;
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || _la==LOCATION || _la==PARTITIONED || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (ROW - 209)) | (1L << (SKEWED - 209)) | (1L << (STORED - 209)) | (1L << (TBLPROPERTIES - 209)))) != 0)) {
					{
					setState(436);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(416);
						match(COMMENT);
						setState(417);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						setState(427);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(418);
							match(PARTITIONED);
							setState(419);
							match(BY);
							setState(420);
							match(T__0);
							setState(421);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(422);
							match(T__2);
							}
							break;
						case 2:
							{
							setState(424);
							match(PARTITIONED);
							setState(425);
							match(BY);
							setState(426);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(429);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(430);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(431);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(432);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(433);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(434);
						match(TBLPROPERTIES);
						setState(435);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REDUCE - 193)) | (1L << (SELECT - 193)) | (1L << (TABLE - 193)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(441);
						match(AS);
						}
					}

					setState(444);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(447);
				match(CREATE);
				setState(448);
				match(TABLE);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(449);
					match(IF);
					setState(450);
					match(NOT);
					setState(451);
					match(EXISTS);
					}
					break;
				}
				setState(454);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(455);
				match(LIKE);
				setState(456);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(457);
					locationSpec();
					}
				}

				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(460);
				replaceTableHeader();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(461);
					match(T__0);
					setState(462);
					colTypeList();
					setState(463);
					match(T__2);
					}
				}

				setState(467);
				tableProvider();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LOCATION - 139)) | (1L << (OPTIONS - 139)) | (1L << (PARTITIONED - 139)))) != 0) || _la==TBLPROPERTIES) {
					{
					setState(479);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(468);
						match(OPTIONS);
						setState(469);
						((ReplaceTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(470);
						match(PARTITIONED);
						setState(471);
						match(BY);
						setState(472);
						((ReplaceTableContext)_localctx).partitioning = transformList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(473);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(474);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(475);
						match(COMMENT);
						setState(476);
						((ReplaceTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(477);
						match(TBLPROPERTIES);
						setState(478);
						((ReplaceTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REDUCE - 193)) | (1L << (SELECT - 193)) | (1L << (TABLE - 193)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(484);
						match(AS);
						}
					}

					setState(487);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(490);
				match(ANALYZE);
				setState(491);
				match(TABLE);
				setState(492);
				tableIdentifier();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(493);
					partitionSpec();
					}
				}

				setState(496);
				match(COMPUTE);
				setState(497);
				match(STATISTICS);
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(498);
					identifier();
					}
					break;
				case 2:
					{
					setState(499);
					match(FOR);
					setState(500);
					match(COLUMNS);
					setState(501);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(502);
					match(FOR);
					setState(503);
					match(ALL);
					setState(504);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(507);
				match(ALTER);
				setState(508);
				match(TABLE);
				setState(509);
				multipartIdentifier();
				setState(510);
				match(ADD);
				setState(511);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(514);
				match(ALTER);
				setState(515);
				match(TABLE);
				setState(516);
				multipartIdentifier();
				setState(517);
				match(ADD);
				setState(518);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(519);
				match(T__0);
				setState(520);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(521);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(523);
				match(ALTER);
				setState(524);
				match(TABLE);
				setState(525);
				multipartIdentifier();
				setState(526);
				match(RENAME);
				setState(527);
				match(COLUMN);
				setState(528);
				((RenameTableColumnContext)_localctx).from = qualifiedName();
				setState(529);
				match(TO);
				setState(530);
				((RenameTableColumnContext)_localctx).to = identifier();
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(532);
				match(ALTER);
				setState(533);
				match(TABLE);
				setState(534);
				multipartIdentifier();
				setState(535);
				match(DROP);
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				match(T__0);
				setState(538);
				((DropTableColumnsContext)_localctx).columns = qualifiedNameList();
				setState(539);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(541);
				match(ALTER);
				setState(542);
				match(TABLE);
				setState(543);
				multipartIdentifier();
				setState(544);
				match(DROP);
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				((DropTableColumnsContext)_localctx).columns = qualifiedNameList();
				}
				break;
			case 20:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(548);
				match(ALTER);
				setState(549);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(550);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(551);
				match(RENAME);
				setState(552);
				match(TO);
				setState(553);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 21:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(555);
				match(ALTER);
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				multipartIdentifier();
				setState(558);
				match(SET);
				setState(559);
				match(TBLPROPERTIES);
				setState(560);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(562);
				match(ALTER);
				setState(563);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(564);
				multipartIdentifier();
				setState(565);
				match(UNSET);
				setState(566);
				match(TBLPROPERTIES);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(567);
					match(IF);
					setState(568);
					match(EXISTS);
					}
				}

				setState(571);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new AlterTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(573);
				match(ALTER);
				setState(574);
				match(TABLE);
				setState(575);
				multipartIdentifier();
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(577);
					match(COLUMN);
					}
					break;
				}
				setState(580);
				qualifiedName();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(581);
					match(TYPE);
					setState(582);
					dataType();
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(585);
					match(COMMENT);
					setState(586);
					((AlterTableColumnContext)_localctx).comment = match(STRING);
					}
				}

				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(589);
					colPosition();
					}
				}

				}
				break;
			case 24:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(592);
				match(ALTER);
				setState(593);
				match(TABLE);
				setState(594);
				tableIdentifier();
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(595);
					partitionSpec();
					}
				}

				setState(598);
				match(CHANGE);
				setState(600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(599);
					match(COLUMN);
					}
					break;
				}
				setState(602);
				((ChangeColumnContext)_localctx).colName = errorCapturingIdentifier();
				setState(603);
				colType();
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(604);
					colPosition();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(607);
				match(ALTER);
				setState(608);
				match(TABLE);
				setState(609);
				tableIdentifier();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(610);
					partitionSpec();
					}
				}

				setState(613);
				match(SET);
				setState(614);
				match(SERDE);
				setState(615);
				match(STRING);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(616);
					match(WITH);
					setState(617);
					match(SERDEPROPERTIES);
					setState(618);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(621);
				match(ALTER);
				setState(622);
				match(TABLE);
				setState(623);
				tableIdentifier();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(624);
					partitionSpec();
					}
				}

				setState(627);
				match(SET);
				setState(628);
				match(SERDEPROPERTIES);
				setState(629);
				tablePropertyList();
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(631);
				match(ALTER);
				setState(632);
				match(TABLE);
				setState(633);
				tableIdentifier();
				setState(634);
				match(ADD);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(635);
					match(IF);
					setState(636);
					match(NOT);
					setState(637);
					match(EXISTS);
					}
				}

				setState(641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(640);
					partitionSpecLocation();
					}
					}
					setState(643); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(645);
				match(ALTER);
				setState(646);
				match(VIEW);
				setState(647);
				tableIdentifier();
				setState(648);
				match(ADD);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(649);
					match(IF);
					setState(650);
					match(NOT);
					setState(651);
					match(EXISTS);
					}
				}

				setState(655); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(654);
					partitionSpec();
					}
					}
					setState(657); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 29:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(659);
				match(ALTER);
				setState(660);
				match(TABLE);
				setState(661);
				tableIdentifier();
				setState(662);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(663);
				match(RENAME);
				setState(664);
				match(TO);
				setState(665);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 30:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(667);
				match(ALTER);
				setState(668);
				match(TABLE);
				setState(669);
				tableIdentifier();
				setState(670);
				match(DROP);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(671);
					match(IF);
					setState(672);
					match(EXISTS);
					}
				}

				setState(675);
				partitionSpec();
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(676);
					match(T__1);
					setState(677);
					partitionSpec();
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(683);
					match(PURGE);
					}
				}

				}
				break;
			case 31:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(686);
				match(ALTER);
				setState(687);
				match(VIEW);
				setState(688);
				tableIdentifier();
				setState(689);
				match(DROP);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(690);
					match(IF);
					setState(691);
					match(EXISTS);
					}
				}

				setState(694);
				partitionSpec();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(695);
					match(T__1);
					setState(696);
					partitionSpec();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 32:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(702);
				match(ALTER);
				setState(703);
				match(TABLE);
				setState(704);
				multipartIdentifier();
				setState(705);
				match(SET);
				setState(706);
				locationSpec();
				}
				break;
			case 33:
				_localctx = new SetPartitionLocationContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(708);
				match(ALTER);
				setState(709);
				match(TABLE);
				setState(710);
				tableIdentifier();
				setState(711);
				partitionSpec();
				setState(712);
				match(SET);
				setState(713);
				locationSpec();
				}
				break;
			case 34:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(715);
				match(ALTER);
				setState(716);
				match(TABLE);
				setState(717);
				tableIdentifier();
				setState(718);
				match(RECOVER);
				setState(719);
				match(PARTITIONS);
				}
				break;
			case 35:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(721);
				match(DROP);
				setState(722);
				match(TABLE);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(723);
					match(IF);
					setState(724);
					match(EXISTS);
					}
					break;
				}
				setState(727);
				multipartIdentifier();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(728);
					match(PURGE);
					}
				}

				}
				break;
			case 36:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(731);
				match(DROP);
				setState(732);
				match(VIEW);
				setState(735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(733);
					match(IF);
					setState(734);
					match(EXISTS);
					}
					break;
				}
				setState(737);
				multipartIdentifier();
				}
				break;
			case 37:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(738);
				match(CREATE);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(739);
					match(OR);
					setState(740);
					match(REPLACE);
					}
				}

				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(743);
						match(GLOBAL);
						}
					}

					setState(746);
					match(TEMPORARY);
					}
				}

				setState(749);
				match(VIEW);
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(750);
					match(IF);
					setState(751);
					match(NOT);
					setState(752);
					match(EXISTS);
					}
					break;
				}
				setState(755);
				tableIdentifier();
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(756);
					identifierCommentList();
					}
				}

				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(766);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(759);
						match(COMMENT);
						setState(760);
						match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(761);
						match(PARTITIONED);
						setState(762);
						match(ON);
						setState(763);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(764);
						match(TBLPROPERTIES);
						setState(765);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(771);
				match(AS);
				setState(772);
				query();
				}
				break;
			case 38:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(774);
				match(CREATE);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(775);
					match(OR);
					setState(776);
					match(REPLACE);
					}
				}

				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(779);
					match(GLOBAL);
					}
				}

				setState(782);
				match(TEMPORARY);
				setState(783);
				match(VIEW);
				setState(784);
				tableIdentifier();
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(785);
					match(T__0);
					setState(786);
					colTypeList();
					setState(787);
					match(T__2);
					}
				}

				setState(791);
				tableProvider();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(792);
					match(OPTIONS);
					setState(793);
					tablePropertyList();
					}
				}

				}
				break;
			case 39:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(796);
				match(ALTER);
				setState(797);
				match(VIEW);
				setState(798);
				tableIdentifier();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(799);
					match(AS);
					}
				}

				setState(802);
				query();
				}
				break;
			case 40:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(804);
				match(CREATE);
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(805);
					match(OR);
					setState(806);
					match(REPLACE);
					}
				}

				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(809);
					match(TEMPORARY);
					}
				}

				setState(812);
				match(FUNCTION);
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(813);
					match(IF);
					setState(814);
					match(NOT);
					setState(815);
					match(EXISTS);
					}
					break;
				}
				setState(818);
				qualifiedName();
				setState(819);
				match(AS);
				setState(820);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(821);
					match(USING);
					setState(822);
					resource();
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(823);
						match(T__1);
						setState(824);
						resource();
						}
						}
						setState(829);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 41:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(832);
				match(DROP);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(833);
					match(TEMPORARY);
					}
				}

				setState(836);
				match(FUNCTION);
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(837);
					match(IF);
					setState(838);
					match(EXISTS);
					}
					break;
				}
				setState(841);
				qualifiedName();
				}
				break;
			case 42:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(842);
				match(EXPLAIN);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXTENDED - 85)) | (1L << (FORMATTED - 85)) | (1L << (LOGICAL - 85)))) != 0)) {
					{
					setState(843);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXTENDED - 85)) | (1L << (FORMATTED - 85)) | (1L << (LOGICAL - 85)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(846);
				statement();
				}
				break;
			case 43:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(847);
				match(SHOW);
				setState(848);
				match(TABLES);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(849);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(850);
					multipartIdentifier();
					}
				}

				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(853);
						match(LIKE);
						}
					}

					setState(856);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(859);
				match(SHOW);
				setState(860);
				match(TABLE);
				setState(861);
				match(EXTENDED);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(862);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(863);
					((ShowTableContext)_localctx).db = errorCapturingIdentifier();
					}
				}

				setState(866);
				match(LIKE);
				setState(867);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(868);
					partitionSpec();
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(871);
				match(SHOW);
				setState(872);
				match(TBLPROPERTIES);
				setState(873);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(874);
					match(T__0);
					setState(875);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(876);
					match(T__2);
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(880);
				match(SHOW);
				setState(881);
				match(COLUMNS);
				setState(882);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(883);
				tableIdentifier();
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(884);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(885);
					((ShowColumnsContext)_localctx).db = errorCapturingIdentifier();
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(888);
				match(SHOW);
				setState(889);
				match(PARTITIONS);
				setState(890);
				tableIdentifier();
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(891);
					partitionSpec();
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(894);
				match(SHOW);
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(895);
					identifier();
					}
					break;
				}
				setState(898);
				match(FUNCTIONS);
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(900);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(899);
						match(LIKE);
						}
						break;
					}
					setState(904);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(902);
						qualifiedName();
						}
						break;
					case 2:
						{
						setState(903);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 49:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(908);
				match(SHOW);
				setState(909);
				match(CREATE);
				setState(910);
				match(TABLE);
				setState(911);
				tableIdentifier();
				}
				break;
			case 50:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(912);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(913);
				match(FUNCTION);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(914);
					match(EXTENDED);
					}
					break;
				}
				setState(917);
				describeFuncName();
				}
				break;
			case 51:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(918);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(919);
				database();
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(920);
					match(EXTENDED);
					}
					break;
				}
				setState(923);
				((DescribeDatabaseContext)_localctx).db = errorCapturingIdentifier();
				}
				break;
			case 52:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(925);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(926);
					match(TABLE);
					}
					break;
				}
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(929);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(932);
				multipartIdentifier();
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(933);
					partitionSpec();
					}
					break;
				}
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(936);
					describeColName();
					}
					break;
				}
				}
				break;
			case 53:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(939);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(940);
					match(QUERY);
					}
				}

				setState(943);
				query();
				}
				break;
			case 54:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(944);
				match(REFRESH);
				setState(945);
				match(TABLE);
				setState(946);
				tableIdentifier();
				}
				break;
			case 55:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(947);
				match(REFRESH);
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(948);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(952);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(949);
							matchWildcard();
							}
							} 
						}
						setState(954);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 56:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(957);
				match(CACHE);
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(958);
					match(LAZY);
					}
				}

				setState(961);
				match(TABLE);
				setState(962);
				tableIdentifier();
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(963);
					match(OPTIONS);
					setState(964);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REDUCE - 193)) | (1L << (SELECT - 193)) | (1L << (TABLE - 193)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(968);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(967);
						match(AS);
						}
					}

					setState(970);
					query();
					}
				}

				}
				break;
			case 57:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(973);
				match(UNCACHE);
				setState(974);
				match(TABLE);
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(975);
					match(IF);
					setState(976);
					match(EXISTS);
					}
					break;
				}
				setState(979);
				tableIdentifier();
				}
				break;
			case 58:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(980);
				match(CLEAR);
				setState(981);
				match(CACHE);
				}
				break;
			case 59:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(982);
				match(LOAD);
				setState(983);
				match(DATA);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(984);
					match(LOCAL);
					}
				}

				setState(987);
				match(INPATH);
				setState(988);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(989);
					match(OVERWRITE);
					}
				}

				setState(992);
				match(INTO);
				setState(993);
				match(TABLE);
				setState(994);
				tableIdentifier();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(995);
					partitionSpec();
					}
				}

				}
				break;
			case 60:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(998);
				match(TRUNCATE);
				setState(999);
				match(TABLE);
				setState(1000);
				tableIdentifier();
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1001);
					partitionSpec();
					}
				}

				}
				break;
			case 61:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(1004);
				match(MSCK);
				setState(1005);
				match(REPAIR);
				setState(1006);
				match(TABLE);
				setState(1007);
				tableIdentifier();
				}
				break;
			case 62:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(1008);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1009);
				identifier();
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1010);
						matchWildcard();
						}
						} 
					}
					setState(1015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				break;
			case 63:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(1016);
				match(SET);
				setState(1017);
				match(ROLE);
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1018);
						matchWildcard();
						}
						} 
					}
					setState(1023);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 64:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(1024);
				match(SET);
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1025);
						matchWildcard();
						}
						} 
					}
					setState(1030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				}
				break;
			case 65:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(1031);
				match(RESET);
				}
				break;
			case 66:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(1032);
				match(DELETE);
				setState(1033);
				match(FROM);
				setState(1034);
				multipartIdentifier();
				setState(1035);
				tableAlias();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1036);
					whereClause();
					}
				}

				}
				break;
			case 67:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1039);
				match(UPDATE);
				setState(1040);
				multipartIdentifier();
				setState(1041);
				tableAlias();
				setState(1042);
				setClause();
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1043);
					whereClause();
					}
				}

				}
				break;
			case 68:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1046);
				unsupportedHiveNativeCommands();
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1047);
						matchWildcard();
						}
						} 
					}
					setState(1052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1056);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1060);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1064);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1068);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1069);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1071);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1075);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1076);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1099);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1118);
				tableIdentifier();
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1124);
				tableIdentifier();
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1130);
				tableIdentifier();
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1136);
				tableIdentifier();
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1142);
				tableIdentifier();
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1148);
				tableIdentifier();
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1156);
				tableIdentifier();
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1163);
				tableIdentifier();
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1169);
				tableIdentifier();
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1175);
				tableIdentifier();
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1181);
				tableIdentifier();
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1186);
				tableIdentifier();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1187);
					partitionSpec();
					}
				}

				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1194);
				tableIdentifier();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1195);
					partitionSpec();
					}
				}

				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1202);
				tableIdentifier();
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1203);
					partitionSpec();
					}
				}

				setState(1206);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1211);
				tableIdentifier();
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1212);
					partitionSpec();
					}
				}

				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(CREATE);
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1228);
				match(TEMPORARY);
				}
			}

			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1231);
				match(EXTERNAL);
				}
			}

			setState(1234);
			match(TABLE);
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1235);
				match(IF);
				setState(1236);
				match(NOT);
				setState(1237);
				match(EXISTS);
				}
				break;
			}
			setState(1240);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1242);
				match(CREATE);
				setState(1243);
				match(OR);
				}
			}

			setState(1246);
			match(REPLACE);
			setState(1247);
			match(TABLE);
			setState(1248);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(CLUSTERED);
			setState(1251);
			match(BY);
			setState(1252);
			identifierList();
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1253);
				match(SORTED);
				setState(1254);
				match(BY);
				setState(1255);
				orderedIdentifierList();
				}
			}

			setState(1258);
			match(INTO);
			setState(1259);
			match(INTEGER_VALUE);
			setState(1260);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(SKEWED);
			setState(1263);
			match(BY);
			setState(1264);
			identifierList();
			setState(1265);
			match(ON);
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1266);
				constantList();
				}
				break;
			case 2:
				{
				setState(1267);
				nestedConstantList();
				}
				break;
			}
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1270);
				match(STORED);
				setState(1271);
				match(AS);
				setState(1272);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(LOCATION);
			setState(1276);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1278);
				ctes();
				}
			}

			setState(1281);
			queryTerm(0);
			setState(1282);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insertInto);
		int _la;
		try {
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				match(INSERT);
				setState(1285);
				match(OVERWRITE);
				setState(1287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1286);
					match(TABLE);
					}
					break;
				}
				setState(1289);
				multipartIdentifier();
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1290);
					partitionSpec();
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1291);
						match(IF);
						setState(1292);
						match(NOT);
						setState(1293);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(INSERT);
				setState(1299);
				match(INTO);
				setState(1301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1300);
					match(TABLE);
					}
					break;
				}
				setState(1303);
				multipartIdentifier();
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1304);
					partitionSpec();
					}
				}

				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1307);
					match(IF);
					setState(1308);
					match(NOT);
					setState(1309);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				match(INSERT);
				setState(1313);
				match(OVERWRITE);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1314);
					match(LOCAL);
					}
				}

				setState(1317);
				match(DIRECTORY);
				setState(1318);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1319);
					rowFormat();
					}
				}

				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1322);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1325);
				match(INSERT);
				setState(1326);
				match(OVERWRITE);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1327);
					match(LOCAL);
					}
				}

				setState(1330);
				match(DIRECTORY);
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1331);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1334);
				tableProvider();
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1335);
					match(OPTIONS);
					setState(1336);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			partitionSpec();
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1342);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(PARTITION);
			setState(1346);
			match(T__0);
			setState(1347);
			partitionVal();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1348);
				match(T__1);
				setState(1349);
				partitionVal();
				}
				}
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1355);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			identifier();
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1358);
				match(EQ);
				setState(1359);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_describeFuncName);
		try {
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1366);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1367);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1368);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1372);
				match(T__3);
				setState(1373);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(WITH);
			setState(1380);
			namedQuery();
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1381);
				match(T__1);
				setState(1382);
				namedQuery();
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1389);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1392);
				match(AS);
				}
			}

			setState(1395);
			match(T__0);
			setState(1396);
			query();
			setState(1397);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(USING);
			setState(1400);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(T__0);
			setState(1403);
			tableProperty();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1404);
				match(T__1);
				setState(1405);
				tableProperty();
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1411);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (TRUE - 249)) | (1L << (EQ - 249)) | (1L << (STRING - 249)) | (1L << (INTEGER_VALUE - 249)) | (1L << (DECIMAL_VALUE - 249)))) != 0)) {
				{
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1414);
					match(EQ);
					}
				}

				setState(1417);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				identifier();
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1421);
					match(T__3);
					setState(1422);
					identifier();
					}
					}
					setState(1427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyValue);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1433);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1434);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(T__0);
			setState(1438);
			constant();
			setState(1443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1439);
				match(T__1);
				setState(1440);
				constant();
				}
				}
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1446);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(T__0);
			setState(1449);
			constantList();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1450);
				match(T__1);
				setState(1451);
				constantList();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1457);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createFileFormat);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				match(STORED);
				setState(1460);
				match(AS);
				setState(1461);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				match(STORED);
				setState(1463);
				match(BY);
				setState(1464);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fileFormat);
		try {
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				match(INPUTFORMAT);
				setState(1468);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1469);
				match(OUTPUTFORMAT);
				setState(1470);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			match(STRING);
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1475);
				match(WITH);
				setState(1476);
				match(SERDEPROPERTIES);
				setState(1477);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			identifier();
			setState(1481);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dmlStatementNoWith);
		int _la;
		try {
			setState(1493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				insertInto();
				setState(1484);
				queryTerm(0);
				setState(1485);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				fromClause();
				setState(1489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1488);
					multiInsertQueryBody();
					}
					}
					setState(1491); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1495);
				match(ORDER);
				setState(1496);
				match(BY);
				setState(1497);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1498);
						match(T__1);
						setState(1499);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			}
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1507);
				match(CLUSTER);
				setState(1508);
				match(BY);
				setState(1509);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1510);
						match(T__1);
						setState(1511);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1519);
				match(DISTRIBUTE);
				setState(1520);
				match(BY);
				setState(1521);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1522);
						match(T__1);
						setState(1523);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1528);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1531);
				match(SORT);
				setState(1532);
				match(BY);
				setState(1533);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1534);
						match(T__1);
						setState(1535);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1540);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1543);
				windowClause();
				}
				break;
			}
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1546);
				match(LIMIT);
				setState(1549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1547);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1548);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			insertInto();
			setState(1554);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1557);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1580);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1559);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1560);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1561);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1563);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1562);
							setQuantifier();
							}
						}

						setState(1565);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1566);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1567);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1568);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1570);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1569);
							setQuantifier();
							}
						}

						setState(1572);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1573);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1574);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1575);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1577);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1576);
							setQuantifier();
							}
						}

						setState(1579);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryPrimary);
		try {
			setState(1594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1587);
				match(TABLE);
				setState(1588);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1589);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1590);
				match(T__0);
				setState(1591);
				query();
				setState(1592);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			expression();
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1597);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1600);
				match(NULLS);
				setState(1601);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			fromClause();
			setState(1606); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1605);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1608); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				transformClause();
				setState(1612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1611);
					whereClause();
					}
					break;
				}
				setState(1614);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616);
				selectClause();
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1617);
						lateralView();
						}
						} 
					}
					setState(1622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1623);
					whereClause();
					}
					break;
				}
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1626);
					aggregationClause();
					}
					break;
				}
				setState(1630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1629);
					havingClause();
					}
					break;
				}
				setState(1633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1632);
					windowClause();
					}
					break;
				}
				setState(1635);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_querySpecification);
		try {
			int _alt;
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				transformClause();
				setState(1641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1640);
					fromClause();
					}
					break;
				}
				setState(1644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1643);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				selectClause();
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1647);
					fromClause();
					}
					break;
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1650);
						lateralView();
						}
						} 
					}
					setState(1655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1656);
					whereClause();
					}
					break;
				}
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1659);
					aggregationClause();
					}
					break;
				}
				setState(1663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1662);
					havingClause();
					}
					break;
				}
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1665);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1670);
				match(SELECT);
				setState(1671);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1672);
				match(T__0);
				setState(1673);
				namedExpressionSeq();
				setState(1674);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1676);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1677);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1678);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1679);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1682);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1685);
				match(RECORDWRITER);
				setState(1686);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1689);
			match(USING);
			setState(1690);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1691);
				match(AS);
				setState(1701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1692);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1693);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1694);
					match(T__0);
					setState(1697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1695);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1696);
						colTypeList();
						}
						break;
					}
					setState(1699);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1705);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1708);
				match(RECORDREADER);
				setState(1709);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(SELECT);
			setState(1716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1713);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1719);
				setQuantifier();
				}
				break;
			}
			setState(1722);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(SET);
			setState(1725);
			assign();
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1726);
				match(T__1);
				setState(1727);
				assign();
				}
				}
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			((AssignContext)_localctx).key = multipartIdentifier();
			setState(1734);
			match(EQ);
			setState(1735);
			((AssignContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(WHERE);
			setState(1738);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(HAVING);
			setState(1741);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(T__4);
			setState(1744);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1746);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						setState(1745);
						match(T__1);
						}
						break;
					}
					setState(1748);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1754);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_hintStatement);
		int _la;
		try {
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1757);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1758);
				match(T__0);
				setState(1759);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1760);
					match(T__1);
					setState(1761);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1767);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(FROM);
			setState(1772);
			relation();
			setState(1777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1773);
					match(T__1);
					setState(1774);
					relation();
					}
					} 
				}
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}
			setState(1783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1780);
					lateralView();
					}
					} 
				}
				setState(1785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1786);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				match(GROUP);
				setState(1790);
				match(BY);
				setState(1791);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1792);
						match(T__1);
						setState(1793);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1798);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
				}
				setState(1816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1799);
					match(WITH);
					setState(1800);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1801);
					match(WITH);
					setState(1802);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1803);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1804);
					match(SETS);
					setState(1805);
					match(T__0);
					setState(1806);
					groupingSet();
					setState(1811);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1807);
						match(T__1);
						setState(1808);
						groupingSet();
						}
						}
						setState(1813);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1814);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				match(GROUP);
				setState(1819);
				match(BY);
				setState(1820);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(1821);
				match(SETS);
				setState(1822);
				match(T__0);
				setState(1823);
				groupingSet();
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1824);
					match(T__1);
					setState(1825);
					groupingSet();
					}
					}
					setState(1830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1831);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_groupingSet);
		int _la;
		try {
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835);
				match(T__0);
				setState(1844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1836);
					expression();
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1837);
						match(T__1);
						setState(1838);
						expression();
						}
						}
						setState(1843);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1846);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(PIVOT);
			setState(1851);
			match(T__0);
			setState(1852);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1853);
			match(FOR);
			setState(1854);
			pivotColumn();
			setState(1855);
			match(IN);
			setState(1856);
			match(T__0);
			setState(1857);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1858);
				match(T__1);
				setState(1859);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1865);
			match(T__2);
			setState(1866);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_pivotColumn);
		int _la;
		try {
			setState(1880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1868);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1869);
				match(T__0);
				setState(1870);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1871);
					match(T__1);
					setState(1872);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1878);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			expression();
			setState(1887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1883);
					match(AS);
					}
					break;
				}
				setState(1886);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			match(LATERAL);
			setState(1890);
			match(VIEW);
			setState(1892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1891);
				match(OUTER);
				}
				break;
			}
			setState(1894);
			qualifiedName();
			setState(1895);
			match(T__0);
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1896);
				expression();
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1897);
					match(T__1);
					setState(1898);
					expression();
					}
					}
					setState(1903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1906);
			match(T__2);
			setState(1907);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1908);
					match(AS);
					}
					break;
				}
				setState(1911);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1912);
						match(T__1);
						setState(1913);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1918);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			relationPrimary();
			setState(1927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1924);
					joinRelation();
					}
					} 
				}
				setState(1929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_joinRelation);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1930);
				joinType();
				}
				setState(1931);
				match(JOIN);
				setState(1932);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1933);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				match(NATURAL);
				setState(1937);
				joinType();
				setState(1938);
				match(JOIN);
				setState(1939);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_joinType);
		int _la;
		try {
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1943);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1946);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1947);
				match(LEFT);
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1948);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1951);
					match(LEFT);
					}
				}

				setState(1954);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1955);
				match(RIGHT);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1956);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1959);
				match(FULL);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1960);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1963);
					match(LEFT);
					}
				}

				setState(1966);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_joinCriteria);
		try {
			setState(1973);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1969);
				match(ON);
				setState(1970);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				match(USING);
				setState(1972);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			match(TABLESAMPLE);
			setState(1976);
			match(T__0);
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1977);
				sampleMethod();
				}
				break;
			}
			setState(1980);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sampleMethod);
		int _la;
		try {
			setState(2006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1982);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1985);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1986);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1987);
				expression();
				setState(1988);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1990);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1991);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1992);
				match(OUT);
				setState(1993);
				match(OF);
				setState(1994);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1995);
					match(ON);
					setState(2001);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
					case 1:
						{
						setState(1996);
						identifier();
						}
						break;
					case 2:
						{
						setState(1997);
						qualifiedName();
						setState(1998);
						match(T__0);
						setState(1999);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2005);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			match(T__0);
			setState(2009);
			identifierSeq();
			setState(2010);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2013);
					match(T__1);
					setState(2014);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			match(T__0);
			setState(2021);
			orderedIdentifier();
			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2022);
				match(T__1);
				setState(2023);
				orderedIdentifier();
				}
				}
				setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2029);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2032);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			match(T__0);
			setState(2036);
			identifierComment();
			setState(2041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2037);
				match(T__1);
				setState(2038);
				identifierComment();
				}
				}
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2044);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			identifier();
			setState(2049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2047);
				match(COMMENT);
				setState(2048);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_relationPrimary);
		try {
			setState(2075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2051);
				multipartIdentifier();
				setState(2053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2052);
					sample();
					}
					break;
				}
				setState(2055);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				match(T__0);
				setState(2058);
				query();
				setState(2059);
				match(T__2);
				setState(2061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2060);
					sample();
					}
					break;
				}
				setState(2063);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2065);
				match(T__0);
				setState(2066);
				relation();
				setState(2067);
				match(T__2);
				setState(2069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2068);
					sample();
					}
					break;
				}
				setState(2071);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2073);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2074);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			match(VALUES);
			setState(2078);
			expression();
			setState(2083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2079);
					match(T__1);
					setState(2080);
					expression();
					}
					} 
				}
				setState(2085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			setState(2086);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2089);
			match(T__0);
			setState(2098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2090);
				expression();
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2091);
					match(T__1);
					setState(2092);
					expression();
					}
					}
					setState(2097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2100);
			match(T__2);
			setState(2101);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2103);
					match(AS);
					}
					break;
				}
				setState(2106);
				strictIdentifier();
				setState(2108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2107);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_rowFormat);
		try {
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2112);
				match(ROW);
				setState(2113);
				match(FORMAT);
				setState(2114);
				match(SERDE);
				setState(2115);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2116);
					match(WITH);
					setState(2117);
					match(SERDEPROPERTIES);
					setState(2118);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2121);
				match(ROW);
				setState(2122);
				match(FORMAT);
				setState(2123);
				match(DELIMITED);
				setState(2133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2124);
					match(FIELDS);
					setState(2125);
					match(TERMINATED);
					setState(2126);
					match(BY);
					setState(2127);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
					case 1:
						{
						setState(2128);
						match(ESCAPED);
						setState(2129);
						match(BY);
						setState(2130);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2135);
					match(COLLECTION);
					setState(2136);
					match(ITEMS);
					setState(2137);
					match(TERMINATED);
					setState(2138);
					match(BY);
					setState(2139);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2142);
					match(MAP);
					setState(2143);
					match(KEYS);
					setState(2144);
					match(TERMINATED);
					setState(2145);
					match(BY);
					setState(2146);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2149);
					match(LINES);
					setState(2150);
					match(TERMINATED);
					setState(2151);
					match(BY);
					setState(2152);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2155);
					match(NULL);
					setState(2156);
					match(DEFINED);
					setState(2157);
					match(AS);
					setState(2158);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2164);
					match(T__3);
					setState(2165);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2171);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2172);
				match(T__3);
				}
				break;
			}
			setState(2176);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2178);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2179);
				match(T__3);
				}
				break;
			}
			setState(2183);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			expression();
			setState(2193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2186);
					match(AS);
					}
					break;
				}
				setState(2191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2189);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2190);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			namedExpression();
			setState(2200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2196);
					match(T__1);
					setState(2197);
					namedExpression();
					}
					} 
				}
				setState(2202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformListContext extends ParserRuleContext {
		public TransformContext transform;
		public List<TransformContext> transforms = new ArrayList<TransformContext>();
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TransformListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformListContext transformList() throws RecognitionException {
		TransformListContext _localctx = new TransformListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			match(T__0);
			setState(2204);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2205);
				match(T__1);
				setState(2206);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2212);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_transform);
		int _la;
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2214);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2216);
				match(T__0);
				setState(2217);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2218);
					match(T__1);
					setState(2219);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2225);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_transformArgument);
		try {
			setState(2231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2229);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2230);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2236);
				match(NOT);
				setState(2237);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2238);
				match(EXISTS);
				setState(2239);
				match(T__0);
				setState(2240);
				query();
				setState(2241);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2243);
				valueExpression(0);
				setState(2245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2244);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2249);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2250);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2251);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2252);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2253);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2254);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_predicate);
		int _la;
		try {
			setState(2313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2260);
					match(NOT);
					}
				}

				setState(2263);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2264);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2265);
				match(AND);
				setState(2266);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2268);
					match(NOT);
					}
				}

				setState(2271);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2272);
				match(T__0);
				setState(2273);
				expression();
				setState(2278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2274);
					match(T__1);
					setState(2275);
					expression();
					}
					}
					setState(2280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2281);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2283);
					match(NOT);
					}
				}

				setState(2286);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2287);
				match(T__0);
				setState(2288);
				query();
				setState(2289);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2291);
					match(NOT);
					}
				}

				setState(2294);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2295);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2296);
				match(IS);
				setState(2298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2297);
					match(NOT);
					}
				}

				setState(2300);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2301);
				match(IS);
				setState(2303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2302);
					match(NOT);
					}
				}

				setState(2305);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2306);
				match(IS);
				setState(2308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2307);
					match(NOT);
					}
				}

				setState(2310);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2311);
				match(FROM);
				setState(2312);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2316);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2317);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (PLUS - 282)) | (1L << (MINUS - 282)) | (1L << (TILDE - 282)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2318);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2321);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2322);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (ASTERISK - 284)) | (1L << (SLASH - 284)) | (1L << (PERCENT - 284)) | (1L << (DIV - 284)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2323);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2324);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2325);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (PLUS - 282)) | (1L << (MINUS - 282)) | (1L << (CONCAT_PIPE - 282)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2326);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2327);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2328);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2329);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2330);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2331);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2332);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2333);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2334);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2335);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2336);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2337);
						comparisonOperator();
						setState(2338);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlBaseParser.LAST_VALUE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlBaseParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlBaseParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlBaseParser.FIRST_VALUE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2346);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2347);
				match(CASE);
				setState(2349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2348);
					whenClause();
					}
					}
					setState(2351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2353);
					match(ELSE);
					setState(2354);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2357);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2359);
				match(CASE);
				setState(2360);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2361);
					whenClause();
					}
					}
					setState(2364); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2366);
					match(ELSE);
					setState(2367);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2370);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2372);
				match(CAST);
				setState(2373);
				match(T__0);
				setState(2374);
				expression();
				setState(2375);
				match(AS);
				setState(2376);
				dataType();
				setState(2377);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2379);
				match(STRUCT);
				setState(2380);
				match(T__0);
				setState(2389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2381);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(2382);
						match(T__1);
						setState(2383);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2388);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2391);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2392);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==FIRST_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2393);
				match(T__0);
				setState(2394);
				expression();
				setState(2397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2395);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2396);
					match(NULLS);
					}
				}

				setState(2399);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2401);
				_la = _input.LA(1);
				if ( !(_la==LAST || _la==LAST_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2402);
				match(T__0);
				setState(2403);
				expression();
				setState(2406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2404);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2405);
					match(NULLS);
					}
				}

				setState(2408);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2410);
				match(POSITION);
				setState(2411);
				match(T__0);
				setState(2412);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2413);
				match(IN);
				setState(2414);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2415);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2417);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2418);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2419);
				qualifiedName();
				setState(2420);
				match(T__3);
				setState(2421);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2423);
				match(T__0);
				setState(2424);
				namedExpression();
				setState(2427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2425);
					match(T__1);
					setState(2426);
					namedExpression();
					}
					}
					setState(2429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(2431);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2433);
				match(T__0);
				setState(2434);
				query();
				setState(2435);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2437);
				qualifiedName();
				setState(2438);
				match(T__0);
				setState(2450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
					case 1:
						{
						setState(2439);
						setQuantifier();
						}
						break;
					}
					setState(2442);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(2443);
						match(T__1);
						setState(2444);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2449);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2452);
				match(T__2);
				setState(2455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2453);
					match(OVER);
					setState(2454);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2457);
				match(IDENTIFIER);
				setState(2458);
				match(T__6);
				setState(2459);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2460);
				match(T__0);
				setState(2461);
				match(IDENTIFIER);
				setState(2464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2462);
					match(T__1);
					setState(2463);
					match(IDENTIFIER);
					}
					}
					setState(2466); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(2468);
				match(T__2);
				setState(2469);
				match(T__6);
				setState(2470);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2471);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2472);
				match(T__0);
				setState(2473);
				expression();
				setState(2474);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2476);
				match(EXTRACT);
				setState(2477);
				match(T__0);
				setState(2478);
				((ExtractContext)_localctx).field = identifier();
				setState(2479);
				match(FROM);
				setState(2480);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2481);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2483);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2484);
				match(T__0);
				setState(2485);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2486);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2487);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==FOR) {
					{
					setState(2488);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2489);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2492);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2494);
				match(TRIM);
				setState(2495);
				match(T__0);
				setState(2497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2496);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2499);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2502);
				match(FROM);
				setState(2503);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2504);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2506);
				match(OVERLAY);
				setState(2507);
				match(T__0);
				setState(2508);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2509);
				match(PLACING);
				setState(2510);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2511);
				match(FROM);
				setState(2512);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2513);
					match(FOR);
					setState(2514);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2517);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2529);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2521);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2522);
						match(T__7);
						setState(2523);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2524);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2526);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2527);
						match(T__3);
						setState(2528);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constant);
		try {
			int _alt;
			setState(2546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2534);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2535);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2536);
				identifier();
				setState(2537);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2539);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2540);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2542); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2541);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2544); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			_la = _input.LA(1);
			if ( !(((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (EQ - 274)) | (1L << (NSEQ - 274)) | (1L << (NEQ - 274)) | (1L << (NEQJ - 274)) | (1L << (LT - 274)) | (1L << (LTE - 274)) | (1L << (GT - 274)) | (1L << (GTE - 274)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_la = _input.LA(1);
			if ( !(((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (PLUS - 282)) | (1L << (MINUS - 282)) | (1L << (ASTERISK - 282)) | (1L << (SLASH - 282)) | (1L << (PERCENT - 282)) | (1L << (DIV - 282)) | (1L << (TILDE - 282)) | (1L << (AMPERSAND - 282)) | (1L << (PIPE - 282)) | (1L << (CONCAT_PIPE - 282)) | (1L << (HAT - 282)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2552);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (IN - 113)) | (1L << (NOT - 113)) | (1L << (OR - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_interval);
		int _la;
		try {
			int _alt;
			setState(2573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2556);
				if (!(ansi)) throw new FailedPredicateException(this, "ansi");
				setState(2558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERVAL) {
					{
					setState(2557);
					match(INTERVAL);
					}
				}

				setState(2561); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2560);
						intervalField();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2563); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2565);
				if (!(!ansi)) throw new FailedPredicateException(this, "!ansi");
				setState(2566);
				match(INTERVAL);
				setState(2570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2567);
						intervalField();
						}
						} 
					}
					setState(2572);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IntervalUnitContext unit;
		public IntervalUnitContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2575);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2576);
			((IntervalFieldContext)_localctx).unit = intervalUnit();
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2577);
				match(TO);
				setState(2578);
				((IntervalFieldContext)_localctx).to = intervalUnit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_intervalValue);
		int _la;
		try {
			setState(2586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2581);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2584);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2585);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_intervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2588);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (DAY - 63)) | (1L << (DAYS - 63)) | (1L << (HOUR - 63)) | (1L << (HOURS - 63)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (MICROSECOND - 146)) | (1L << (MICROSECONDS - 146)) | (1L << (MILLISECOND - 146)) | (1L << (MILLISECONDS - 146)) | (1L << (MINUTE - 146)) | (1L << (MINUTES - 146)) | (1L << (MONTH - 146)) | (1L << (MONTHS - 146)))) != 0) || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (SECOND - 212)) | (1L << (SECONDS - 212)) | (1L << (WEEK - 212)) | (1L << (WEEKS - 212)) | (1L << (YEAR - 212)) | (1L << (YEARS - 212)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_colPosition);
		try {
			setState(2593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2590);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2591);
				match(AFTER);
				setState(2592);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_dataType);
		int _la;
		try {
			setState(2629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2595);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2596);
				match(LT);
				setState(2597);
				dataType();
				setState(2598);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2600);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2601);
				match(LT);
				setState(2602);
				dataType();
				setState(2603);
				match(T__1);
				setState(2604);
				dataType();
				setState(2605);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2607);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2614);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2608);
					match(LT);
					setState(2610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
					case 1:
						{
						setState(2609);
						complexColTypeList();
						}
						break;
					}
					setState(2612);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2613);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2616);
				identifier();
				setState(2627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2617);
					match(T__0);
					setState(2618);
					match(INTEGER_VALUE);
					setState(2623);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(2619);
						match(T__1);
						setState(2620);
						match(INTEGER_VALUE);
						}
						}
						setState(2625);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2626);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_qualifiedColTypeWithPositionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
			qualifiedColTypeWithPosition();
			setState(2636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2632);
					match(T__1);
					setState(2633);
					qualifiedColTypeWithPosition();
					}
					} 
				}
				setState(2638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public QualifiedNameContext name;
		public Token comment;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			((QualifiedColTypeWithPositionContext)_localctx).name = qualifiedName();
			setState(2640);
			dataType();
			setState(2643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2641);
				match(COMMENT);
				setState(2642);
				((QualifiedColTypeWithPositionContext)_localctx).comment = match(STRING);
				}
			}

			setState(2646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2645);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2648);
			colType();
			setState(2653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2649);
					match(T__1);
					setState(2650);
					colType();
					}
					} 
				}
				setState(2655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2656);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2657);
			dataType();
			setState(2660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2658);
				match(COMMENT);
				setState(2659);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			complexColType();
			setState(2667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2663);
				match(T__1);
				setState(2664);
				complexColType();
				}
				}
				setState(2669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
			identifier();
			setState(2671);
			match(T__9);
			setState(2672);
			dataType();
			setState(2675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2673);
				match(COMMENT);
				setState(2674);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			match(WHEN);
			setState(2678);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2679);
			match(THEN);
			setState(2680);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2682);
			match(WINDOW);
			setState(2683);
			namedWindow();
			setState(2688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2684);
					match(T__1);
					setState(2685);
					namedWindow();
					}
					} 
				}
				setState(2690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2692);
			match(AS);
			setState(2693);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_windowSpec);
		int _la;
		try {
			setState(2741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2695);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2696);
				match(T__0);
				setState(2697);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2698);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2700);
				match(T__0);
				setState(2735);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2701);
					match(CLUSTER);
					setState(2702);
					match(BY);
					setState(2703);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2708);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(2704);
						match(T__1);
						setState(2705);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2710);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2711);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2712);
						match(BY);
						setState(2713);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2718);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(2714);
							match(T__1);
							setState(2715);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2720);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2723);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2724);
						match(BY);
						setState(2725);
						sortItem();
						setState(2730);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(2726);
							match(T__1);
							setState(2727);
							sortItem();
							}
							}
							setState(2732);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2737);
					windowFrame();
					}
				}

				setState(2740);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_windowFrame);
		try {
			setState(2759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2743);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2744);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2745);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2746);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2747);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2748);
				match(BETWEEN);
				setState(2749);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2750);
				match(AND);
				setState(2751);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2753);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2754);
				match(BETWEEN);
				setState(2755);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2756);
				match(AND);
				setState(2757);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_frameBound);
		int _la;
		try {
			setState(2768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2761);
				match(UNBOUNDED);
				setState(2762);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2763);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2764);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2765);
				expression();
				setState(2766);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
			qualifiedName();
			setState(2775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2771);
				match(T__1);
				setState(2772);
				qualifiedName();
				}
				}
				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
			identifier();
			setState(2783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2779);
					match(T__3);
					setState(2780);
					identifier();
					}
					} 
				}
				setState(2785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			identifier();
			setState(2787);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2791); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2789);
						match(MINUS);
						setState(2790);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2793); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_identifier);
		try {
			setState(2801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2798);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2799);
				if (!(!ansi)) throw new FailedPredicateException(this, "!ansi");
				setState(2800);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_strictIdentifier);
		try {
			setState(2809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2803);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2804);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2805);
				if (!(ansi)) throw new FailedPredicateException(this, "ansi");
				setState(2806);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2807);
				if (!(!ansi)) throw new FailedPredicateException(this, "!ansi");
				setState(2808);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_number);
		int _la;
		try {
			setState(2841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2813);
					match(MINUS);
					}
				}

				setState(2816);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2817);
					match(MINUS);
					}
				}

				setState(2820);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2821);
					match(MINUS);
					}
				}

				setState(2824);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2825);
					match(MINUS);
					}
				}

				setState(2828);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2829);
					match(MINUS);
					}
				}

				setState(2832);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2833);
					match(MINUS);
					}
				}

				setState(2836);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2837);
					match(MINUS);
					}
				}

				setState(2840);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2843);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAYS - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LATERAL - 129)) | (1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MICROSECOND - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLISECOND - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MINUTES - 129)) | (1L << (MONTHS - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REDUCE - 193)) | (1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SECONDS - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SET - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESAMPLE - 193)) | (1L << (TBLPROPERTIES - 193)) | (1L << (TEMPORARY - 193)) | (1L << (TERMINATED - 193)) | (1L << (TOUCH - 193)) | (1L << (TRANSACTION - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (TRANSFORM - 193)) | (1L << (TRIM - 193)) | (1L << (TRUE - 193)) | (1L << (TRUNCATE - 193)) | (1L << (UNARCHIVE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNCACHE - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (UNLOCK - 258)) | (1L << (UNSET - 258)) | (1L << (UPDATE - 258)) | (1L << (USE - 258)) | (1L << (VALUES - 258)) | (1L << (VIEW - 258)) | (1L << (WEEK - 258)) | (1L << (WEEKS - 258)) | (1L << (WINDOW - 258)) | (1L << (YEARS - 258)) | (1L << (DIV - 258)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2845);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (EXCEPT - 80)) | (1L << (FULL - 80)) | (1L << (INNER - 80)) | (1L << (INTERSECT - 80)) | (1L << (JOIN - 80)) | (1L << (LEFT - 80)))) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (NATURAL - 158)) | (1L << (ON - 158)) | (1L << (RIGHT - 158)) | (1L << (SEMI - 158)) | (1L << (SETMINUS - 158)))) != 0) || _la==UNION || _la==USING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlBaseParser.FIRST_VALUE, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlBaseParser.LAST_VALUE, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2847);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAYS - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAST_VALUE - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MICROSECONDS - 128)) | (1L << (MILLISECOND - 128)) | (1L << (MILLISECONDS - 128)) | (1L << (MINUTE - 128)) | (1L << (MINUTES - 128)) | (1L << (MONTH - 128)) | (1L << (MONTHS - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RECOVER - 192)) | (1L << (REDUCE - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECOND - 192)) | (1L << (SECONDS - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNIQUE - 256)) | (1L << (UNKNOWN - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (WEEK - 256)) | (1L << (WEEKS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (YEARS - 256)) | (1L << (DIV - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 87:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 89:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 90:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 96:
			return interval_sempred((IntervalContext)_localctx, predIndex);
		case 118:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 119:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean interval_sempred(IntervalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return ansi;
		case 17:
			return !ansi;
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return !ansi;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return ansi;
		case 20:
			return !ansi;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0135\u0b24\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5"+
		"\t\u0114\n\t\3\t\5\t\u0117\n\t\3\t\3\t\3\t\3\t\5\t\u011d\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u0124\n\t\f\t\16\t\u0127\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u012e"+
		"\n\t\f\t\16\t\u0131\13\t\3\t\5\t\u0134\n\t\3\n\3\n\5\n\u0138\n\n\3\n\3"+
		"\n\3\n\5\n\u013d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0145\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u014e\n\n\f\n\16\n\u0151\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0164\n\n\3\n\3\n"+
		"\5\n\u0168\n\n\3\n\3\n\3\n\5\n\u016d\n\n\3\n\5\n\u0170\n\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0176\n\n\3\n\5\n\u0179\n\n\3\n\5\n\u017c\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0183\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0191\n\n\f\n\16\n\u0194\13\n\3\n\5\n\u0197\n\n\3\n\5\n\u019a\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u01a1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u01ae\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01b7\n\n\f\n\16\n"+
		"\u01ba\13\n\3\n\5\n\u01bd\n\n\3\n\5\n\u01c0\n\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u01c7\n\n\3\n\3\n\3\n\3\n\5\n\u01cd\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u01d4"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01e2\n\n\f\n"+
		"\16\n\u01e5\13\n\3\n\5\n\u01e8\n\n\3\n\5\n\u01eb\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u01f1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01fc\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u023c\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0245\n\n\3\n\3\n\3\n\5\n\u024a\n\n\3\n\3\n\5\n\u024e\n\n\3\n\5"+
		"\n\u0251\n\n\3\n\3\n\3\n\3\n\5\n\u0257\n\n\3\n\3\n\5\n\u025b\n\n\3\n\3"+
		"\n\3\n\5\n\u0260\n\n\3\n\3\n\3\n\3\n\5\n\u0266\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u026e\n\n\3\n\3\n\3\n\3\n\5\n\u0274\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0281\n\n\3\n\6\n\u0284\n\n\r\n\16\n\u0285"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u028f\n\n\3\n\6\n\u0292\n\n\r\n\16\n"+
		"\u0293\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02a4"+
		"\n\n\3\n\3\n\3\n\7\n\u02a9\n\n\f\n\16\n\u02ac\13\n\3\n\5\n\u02af\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u02b7\n\n\3\n\3\n\3\n\7\n\u02bc\n\n\f\n\16"+
		"\n\u02bf\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02d8\n\n\3\n\3\n\5\n\u02dc\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u02e2\n\n\3\n\3\n\3\n\3\n\5\n\u02e8\n\n\3\n\5\n"+
		"\u02eb\n\n\3\n\5\n\u02ee\n\n\3\n\3\n\3\n\3\n\5\n\u02f4\n\n\3\n\3\n\5\n"+
		"\u02f8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0301\n\n\f\n\16\n\u0304\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u030c\n\n\3\n\5\n\u030f\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0318\n\n\3\n\3\n\3\n\5\n\u031d\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0323\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u032a\n\n\3\n\5\n\u032d\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0333\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u033c\n\n"+
		"\f\n\16\n\u033f\13\n\5\n\u0341\n\n\3\n\3\n\5\n\u0345\n\n\3\n\3\n\3\n\5"+
		"\n\u034a\n\n\3\n\3\n\3\n\5\n\u034f\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0356\n"+
		"\n\3\n\5\n\u0359\n\n\3\n\5\n\u035c\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0363\n"+
		"\n\3\n\3\n\3\n\5\n\u0368\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0371\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0379\n\n\3\n\3\n\3\n\3\n\5\n\u037f\n\n\3"+
		"\n\3\n\5\n\u0383\n\n\3\n\3\n\5\n\u0387\n\n\3\n\3\n\5\n\u038b\n\n\5\n\u038d"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0396\n\n\3\n\3\n\3\n\3\n\5\n\u039c"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u03a2\n\n\3\n\5\n\u03a5\n\n\3\n\3\n\5\n\u03a9"+
		"\n\n\3\n\5\n\u03ac\n\n\3\n\3\n\5\n\u03b0\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u03b9\n\n\f\n\16\n\u03bc\13\n\5\n\u03be\n\n\3\n\3\n\5\n\u03c2\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u03c8\n\n\3\n\5\n\u03cb\n\n\3\n\5\n\u03ce\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u03d4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u03dc\n\n\3\n"+
		"\3\n\3\n\5\n\u03e1\n\n\3\n\3\n\3\n\3\n\5\n\u03e7\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u03ed\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u03f6\n\n\f\n\16\n\u03f9"+
		"\13\n\3\n\3\n\3\n\7\n\u03fe\n\n\f\n\16\n\u0401\13\n\3\n\3\n\7\n\u0405"+
		"\n\n\f\n\16\n\u0408\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0410\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0417\n\n\3\n\3\n\7\n\u041b\n\n\f\n\16\n\u041e\13\n\5"+
		"\n\u0420\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0428\n\13\3\13\3\13\5"+
		"\13\u042c\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0433\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u04a7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u04af\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u04b7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u04c0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u04cc\n\13\3\f\3\f\5\f\u04d0\n\f\3\f\5\f\u04d3\n\f\3\f\3\f\3\f\3\f\5"+
		"\f\u04d9\n\f\3\f\3\f\3\r\3\r\5\r\u04df\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u04eb\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u04f7\n\17\3\17\3\17\3\17\5\17\u04fc\n\17\3\20\3"+
		"\20\3\20\3\21\5\21\u0502\n\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u050a"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0511\n\22\5\22\u0513\n\22\3\22\3"+
		"\22\3\22\5\22\u0518\n\22\3\22\3\22\5\22\u051c\n\22\3\22\3\22\3\22\5\22"+
		"\u0521\n\22\3\22\3\22\3\22\5\22\u0526\n\22\3\22\3\22\3\22\5\22\u052b\n"+
		"\22\3\22\5\22\u052e\n\22\3\22\3\22\3\22\5\22\u0533\n\22\3\22\3\22\5\22"+
		"\u0537\n\22\3\22\3\22\3\22\5\22\u053c\n\22\5\22\u053e\n\22\3\23\3\23\5"+
		"\23\u0542\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u0549\n\24\f\24\16\24\u054c"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u0553\n\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u055c\n\27\3\30\3\30\3\30\7\30\u0561\n\30\f\30\16\30"+
		"\u0564\13\30\3\31\3\31\3\31\3\31\7\31\u056a\n\31\f\31\16\31\u056d\13\31"+
		"\3\32\3\32\5\32\u0571\n\32\3\32\5\32\u0574\n\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0581\n\34\f\34\16\34\u0584\13"+
		"\34\3\34\3\34\3\35\3\35\5\35\u058a\n\35\3\35\5\35\u058d\n\35\3\36\3\36"+
		"\3\36\7\36\u0592\n\36\f\36\16\36\u0595\13\36\3\36\5\36\u0598\n\36\3\37"+
		"\3\37\3\37\3\37\5\37\u059e\n\37\3 \3 \3 \3 \7 \u05a4\n \f \16 \u05a7\13"+
		" \3 \3 \3!\3!\3!\3!\7!\u05af\n!\f!\16!\u05b2\13!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u05bc\n\"\3#\3#\3#\3#\3#\5#\u05c3\n#\3$\3$\3$\3$\5$\u05c9"+
		"\n$\3%\3%\3%\3&\3&\3&\3&\3&\3&\6&\u05d4\n&\r&\16&\u05d5\5&\u05d8\n&\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u05df\n\'\f\'\16\'\u05e2\13\'\5\'\u05e4\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\7\'\u05eb\n\'\f\'\16\'\u05ee\13\'\5\'\u05f0\n\'\3\'\3"+
		"\'\3\'\3\'\3\'\7\'\u05f7\n\'\f\'\16\'\u05fa\13\'\5\'\u05fc\n\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u0603\n\'\f\'\16\'\u0606\13\'\5\'\u0608\n\'\3\'\5\'\u060b"+
		"\n\'\3\'\3\'\3\'\5\'\u0610\n\'\5\'\u0612\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u061e\n)\3)\3)\3)\3)\3)\5)\u0625\n)\3)\3)\3)\3)\3)\5)\u062c\n"+
		")\3)\7)\u062f\n)\f)\16)\u0632\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u063d"+
		"\n*\3+\3+\5+\u0641\n+\3+\3+\5+\u0645\n+\3,\3,\6,\u0649\n,\r,\16,\u064a"+
		"\3-\3-\5-\u064f\n-\3-\3-\3-\3-\7-\u0655\n-\f-\16-\u0658\13-\3-\5-\u065b"+
		"\n-\3-\5-\u065e\n-\3-\5-\u0661\n-\3-\5-\u0664\n-\3-\3-\5-\u0668\n-\3."+
		"\3.\5.\u066c\n.\3.\5.\u066f\n.\3.\3.\5.\u0673\n.\3.\7.\u0676\n.\f.\16"+
		".\u0679\13.\3.\5.\u067c\n.\3.\5.\u067f\n.\3.\5.\u0682\n.\3.\5.\u0685\n"+
		".\5.\u0687\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0693\n/\3/\5/\u0696\n"+
		"/\3/\3/\5/\u069a\n/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u06a4\n/\3/\3/\5/\u06a8"+
		"\n/\5/\u06aa\n/\3/\5/\u06ad\n/\3/\3/\5/\u06b1\n/\3\60\3\60\7\60\u06b5"+
		"\n\60\f\60\16\60\u06b8\13\60\3\60\5\60\u06bb\n\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\7\61\u06c3\n\61\f\61\16\61\u06c6\13\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u06d5\n\65\3\65\7\65"+
		"\u06d8\n\65\f\65\16\65\u06db\13\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u06e5\n\66\f\66\16\66\u06e8\13\66\3\66\3\66\5\66\u06ec\n\66"+
		"\3\67\3\67\3\67\3\67\7\67\u06f2\n\67\f\67\16\67\u06f5\13\67\3\67\7\67"+
		"\u06f8\n\67\f\67\16\67\u06fb\13\67\3\67\5\67\u06fe\n\67\38\38\38\38\3"+
		"8\78\u0705\n8\f8\168\u0708\138\38\38\38\38\38\38\38\38\38\38\78\u0714"+
		"\n8\f8\168\u0717\138\38\38\58\u071b\n8\38\38\38\38\38\38\38\38\78\u0725"+
		"\n8\f8\168\u0728\138\38\38\58\u072c\n8\39\39\39\39\79\u0732\n9\f9\169"+
		"\u0735\139\59\u0737\n9\39\39\59\u073b\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\7:\u0747\n:\f:\16:\u074a\13:\3:\3:\3:\3;\3;\3;\3;\3;\7;\u0754\n;\f;"+
		"\16;\u0757\13;\3;\3;\5;\u075b\n;\3<\3<\5<\u075f\n<\3<\5<\u0762\n<\3=\3"+
		"=\3=\5=\u0767\n=\3=\3=\3=\3=\3=\7=\u076e\n=\f=\16=\u0771\13=\5=\u0773"+
		"\n=\3=\3=\3=\5=\u0778\n=\3=\3=\3=\7=\u077d\n=\f=\16=\u0780\13=\5=\u0782"+
		"\n=\3>\3>\3?\3?\7?\u0788\n?\f?\16?\u078b\13?\3@\3@\3@\3@\5@\u0791\n@\3"+
		"@\3@\3@\3@\3@\5@\u0798\n@\3A\5A\u079b\nA\3A\3A\3A\5A\u07a0\nA\3A\5A\u07a3"+
		"\nA\3A\3A\3A\5A\u07a8\nA\3A\3A\5A\u07ac\nA\3A\5A\u07af\nA\3A\5A\u07b2"+
		"\nA\3B\3B\3B\3B\5B\u07b8\nB\3C\3C\3C\5C\u07bd\nC\3C\3C\3D\5D\u07c2\nD"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u07d4\nD\5D\u07d6"+
		"\nD\3D\5D\u07d9\nD\3E\3E\3E\3E\3F\3F\3F\7F\u07e2\nF\fF\16F\u07e5\13F\3"+
		"G\3G\3G\3G\7G\u07eb\nG\fG\16G\u07ee\13G\3G\3G\3H\3H\5H\u07f4\nH\3I\3I"+
		"\3I\3I\7I\u07fa\nI\fI\16I\u07fd\13I\3I\3I\3J\3J\3J\5J\u0804\nJ\3K\3K\5"+
		"K\u0808\nK\3K\3K\3K\3K\3K\3K\5K\u0810\nK\3K\3K\3K\3K\3K\3K\5K\u0818\n"+
		"K\3K\3K\3K\3K\5K\u081e\nK\3L\3L\3L\3L\7L\u0824\nL\fL\16L\u0827\13L\3L"+
		"\3L\3M\3M\3M\3M\3M\7M\u0830\nM\fM\16M\u0833\13M\5M\u0835\nM\3M\3M\3M\3"+
		"N\5N\u083b\nN\3N\3N\5N\u083f\nN\5N\u0841\nN\3O\3O\3O\3O\3O\3O\3O\5O\u084a"+
		"\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0856\nO\5O\u0858\nO\3O\3O\3O\3O"+
		"\3O\5O\u085f\nO\3O\3O\3O\3O\3O\5O\u0866\nO\3O\3O\3O\3O\5O\u086c\nO\3O"+
		"\3O\3O\3O\5O\u0872\nO\5O\u0874\nO\3P\3P\3P\7P\u0879\nP\fP\16P\u087c\13"+
		"P\3Q\3Q\3Q\5Q\u0881\nQ\3Q\3Q\3R\3R\3R\5R\u0888\nR\3R\3R\3S\3S\5S\u088e"+
		"\nS\3S\3S\5S\u0892\nS\5S\u0894\nS\3T\3T\3T\7T\u0899\nT\fT\16T\u089c\13"+
		"T\3U\3U\3U\3U\7U\u08a2\nU\fU\16U\u08a5\13U\3U\3U\3V\3V\3V\3V\3V\3V\7V"+
		"\u08af\nV\fV\16V\u08b2\13V\3V\3V\5V\u08b6\nV\3W\3W\5W\u08ba\nW\3X\3X\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u08c8\nY\5Y\u08ca\nY\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\7Y\u08d2\nY\fY\16Y\u08d5\13Y\3Z\5Z\u08d8\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u08e0"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u08e7\nZ\fZ\16Z\u08ea\13Z\3Z\3Z\3Z\5Z\u08ef\nZ\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\5Z\u08f7\nZ\3Z\3Z\3Z\3Z\5Z\u08fd\nZ\3Z\3Z\3Z\5Z\u0902"+
		"\nZ\3Z\3Z\3Z\5Z\u0907\nZ\3Z\3Z\3Z\5Z\u090c\nZ\3[\3[\3[\3[\5[\u0912\n["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u0927\n["+
		"\f[\16[\u092a\13[\3\\\3\\\3\\\3\\\6\\\u0930\n\\\r\\\16\\\u0931\3\\\3\\"+
		"\5\\\u0936\n\\\3\\\3\\\3\\\3\\\3\\\6\\\u093d\n\\\r\\\16\\\u093e\3\\\3"+
		"\\\5\\\u0943\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\7\\\u0953\n\\\f\\\16\\\u0956\13\\\5\\\u0958\n\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u0960\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0969\n\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\6\\"+
		"\u097e\n\\\r\\\16\\\u097f\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u098b"+
		"\n\\\3\\\3\\\3\\\7\\\u0990\n\\\f\\\16\\\u0993\13\\\5\\\u0995\n\\\3\\\3"+
		"\\\3\\\5\\\u099a\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\6\\\u09a3\n\\\r\\\16"+
		"\\\u09a4\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u09bd\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u09c4"+
		"\n\\\3\\\5\\\u09c7\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u09d6\n\\\3\\\3\\\5\\\u09da\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\7\\\u09e4\n\\\f\\\16\\\u09e7\13\\\3]\3]\3]\3]\3]\3]\3]\3]\6]\u09f1"+
		"\n]\r]\16]\u09f2\5]\u09f5\n]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\5b\u0a01\n"+
		"b\3b\6b\u0a04\nb\rb\16b\u0a05\3b\3b\3b\7b\u0a0b\nb\fb\16b\u0a0e\13b\5"+
		"b\u0a10\nb\3c\3c\3c\3c\5c\u0a16\nc\3d\5d\u0a19\nd\3d\3d\5d\u0a1d\nd\3"+
		"e\3e\3f\3f\3f\5f\u0a24\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3"+
		"g\5g\u0a35\ng\3g\3g\5g\u0a39\ng\3g\3g\3g\3g\3g\7g\u0a40\ng\fg\16g\u0a43"+
		"\13g\3g\5g\u0a46\ng\5g\u0a48\ng\3h\3h\3h\7h\u0a4d\nh\fh\16h\u0a50\13h"+
		"\3i\3i\3i\3i\5i\u0a56\ni\3i\5i\u0a59\ni\3j\3j\3j\7j\u0a5e\nj\fj\16j\u0a61"+
		"\13j\3k\3k\3k\3k\5k\u0a67\nk\3l\3l\3l\7l\u0a6c\nl\fl\16l\u0a6f\13l\3m"+
		"\3m\3m\3m\3m\5m\u0a76\nm\3n\3n\3n\3n\3n\3o\3o\3o\3o\7o\u0a81\no\fo\16"+
		"o\u0a84\13o\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\7q\u0a95\nq\f"+
		"q\16q\u0a98\13q\3q\3q\3q\3q\3q\7q\u0a9f\nq\fq\16q\u0aa2\13q\5q\u0aa4\n"+
		"q\3q\3q\3q\3q\3q\7q\u0aab\nq\fq\16q\u0aae\13q\5q\u0ab0\nq\5q\u0ab2\nq"+
		"\3q\5q\u0ab5\nq\3q\5q\u0ab8\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\5r\u0aca\nr\3s\3s\3s\3s\3s\3s\3s\5s\u0ad3\ns\3t\3t\3t\7t\u0ad8"+
		"\nt\ft\16t\u0adb\13t\3u\3u\3u\7u\u0ae0\nu\fu\16u\u0ae3\13u\3v\3v\3v\3"+
		"w\3w\6w\u0aea\nw\rw\16w\u0aeb\3w\5w\u0aef\nw\3x\3x\3x\5x\u0af4\nx\3y\3"+
		"y\3y\3y\3y\3y\5y\u0afc\ny\3z\3z\3{\5{\u0b01\n{\3{\3{\5{\u0b05\n{\3{\3"+
		"{\5{\u0b09\n{\3{\3{\5{\u0b0d\n{\3{\3{\5{\u0b11\n{\3{\3{\5{\u0b15\n{\3"+
		"{\3{\5{\u0b19\n{\3{\5{\u0b1c\n{\3|\3|\3}\3}\3~\3~\3~\b\u0125\u03ba\u03f7"+
		"\u03ff\u0406\u041c\6P\u00b0\u00b4\u00b6\177\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\2+\4\2!!\u00cb\u00cb\4\2eess\3\2,-\4\2\u00ed\u00ed\u010b"+
		"\u010b\4\2\20\20$$\7\2))\65\65WWdd\u0090\u0090\3\2GH\4\2WWdd\4\2\r\r\u008a"+
		"\u008a\4\2??\u00d5\u00d5\6\2RRzz\u00df\u00df\u0101\u0101\5\2RR\u00df\u00df"+
		"\u0101\u0101\4\2\30\30GG\4\2^^\u0081\u0081\4\2\17\17LL\3\2\u012b\u012c"+
		"\4\2\u0087\u0087\u00ce\u00ce\5\2ZZ\u00fb\u00fb\u0103\u0103\4\2\u011c\u011d"+
		"\u0122\u0122\3\2\u011e\u0121\4\2\u011c\u011d\u0125\u0125\4\2::<<\3\2^"+
		"_\4\2qq\u00ca\u00ca\3\2\u0081\u0082\3\2\u00eb\u00ec\4\2\4\4ee\4\2\4\4"+
		"aa\5\2\34\34\u0085\u0085\u00f6\u00f6\3\2\u0114\u011b\3\2\u011c\u0126\6"+
		"\2\22\22ss\u00a2\u00a2\u00aa\u00aa\4\2ZZ\u00fb\u00fb\3\2\u011c\u011d\b"+
		"\2ABno\u0094\u009b\u00d6\u00d7\u010c\u010d\u0112\u0113\4\2MM\u00b3\u00b3"+
		"\4\2\u00ab\u00ab\u00e4\u00e4\4\2``\u00ba\u00ba;\2\r\16\20\21\25\26\30"+
		"\31\33\33\35!$$&)++-\63\65\6589>@BKMNQQSY\\^``cdgillortuwy{{~~\u0080\u0081"+
		"\u0083\u0084\u0087\u0090\u0092\u0097\u0099\u0099\u009b\u009c\u009e\u009f"+
		"\u00a1\u00a1\u00a4\u00a5\u00a8\u00a9\u00ac\u00ac\u00ae\u00af\u00b1\u00ba"+
		"\u00bc\u00c3\u00c5\u00cc\u00ce\u00d5\u00d7\u00d7\u00da\u00dc\u00de\u00de"+
		"\u00e0\u00e2\u00e4\u00ec\u00ee\u00f2\u00f5\u00f5\u00f7\u00fc\u00fe\u0100"+
		"\u0104\u0107\u010a\u010d\u0110\u0110\u0113\u0113\u0121\u0121\21\2\23\23"+
		"\67\67RRffvvzz\177\177\u0086\u0086\u00a0\u00a0\u00a6\u00a6\u00cd\u00cd"+
		"\u00d9\u00d9\u00df\u00df\u0101\u0101\u0109\u0109\25\2\r\22\24\668QSeg"+
		"uwy{~\u0080\u0085\u0087\u0090\u0092\u009c\u009e\u009f\u00a1\u00a5\u00a7"+
		"\u00cc\u00ce\u00d8\u00da\u00de\u00e0\u0100\u0102\u0108\u010a\u0113\u0121"+
		"\u0121\2\u0ce5\2\u00fc\3\2\2\2\4\u00ff\3\2\2\2\6\u0102\3\2\2\2\b\u0105"+
		"\3\2\2\2\n\u0108\3\2\2\2\f\u010b\3\2\2\2\16\u010e\3\2\2\2\20\u0111\3\2"+
		"\2\2\22\u041f\3\2\2\2\24\u04cb\3\2\2\2\26\u04cd\3\2\2\2\30\u04de\3\2\2"+
		"\2\32\u04e4\3\2\2\2\34\u04f0\3\2\2\2\36\u04fd\3\2\2\2 \u0501\3\2\2\2\""+
		"\u053d\3\2\2\2$\u053f\3\2\2\2&\u0543\3\2\2\2(\u054f\3\2\2\2*\u0554\3\2"+
		"\2\2,\u055b\3\2\2\2.\u055d\3\2\2\2\60\u0565\3\2\2\2\62\u056e\3\2\2\2\64"+
		"\u0579\3\2\2\2\66\u057c\3\2\2\28\u0587\3\2\2\2:\u0597\3\2\2\2<\u059d\3"+
		"\2\2\2>\u059f\3\2\2\2@\u05aa\3\2\2\2B\u05bb\3\2\2\2D\u05c2\3\2\2\2F\u05c4"+
		"\3\2\2\2H\u05ca\3\2\2\2J\u05d7\3\2\2\2L\u05e3\3\2\2\2N\u0613\3\2\2\2P"+
		"\u0616\3\2\2\2R\u063c\3\2\2\2T\u063e\3\2\2\2V\u0646\3\2\2\2X\u0667\3\2"+
		"\2\2Z\u0686\3\2\2\2\\\u0692\3\2\2\2^\u06b2\3\2\2\2`\u06be\3\2\2\2b\u06c7"+
		"\3\2\2\2d\u06cb\3\2\2\2f\u06ce\3\2\2\2h\u06d1\3\2\2\2j\u06eb\3\2\2\2l"+
		"\u06ed\3\2\2\2n\u072b\3\2\2\2p\u073a\3\2\2\2r\u073c\3\2\2\2t\u075a\3\2"+
		"\2\2v\u075c\3\2\2\2x\u0763\3\2\2\2z\u0783\3\2\2\2|\u0785\3\2\2\2~\u0797"+
		"\3\2\2\2\u0080\u07b1\3\2\2\2\u0082\u07b7\3\2\2\2\u0084\u07b9\3\2\2\2\u0086"+
		"\u07d8\3\2\2\2\u0088\u07da\3\2\2\2\u008a\u07de\3\2\2\2\u008c\u07e6\3\2"+
		"\2\2\u008e\u07f1\3\2\2\2\u0090\u07f5\3\2\2\2\u0092\u0800\3\2\2\2\u0094"+
		"\u081d\3\2\2\2\u0096\u081f\3\2\2\2\u0098\u082a\3\2\2\2\u009a\u0840\3\2"+
		"\2\2\u009c\u0873\3\2\2\2\u009e\u0875\3\2\2\2\u00a0\u0880\3\2\2\2\u00a2"+
		"\u0887\3\2\2\2\u00a4\u088b\3\2\2\2\u00a6\u0895\3\2\2\2\u00a8\u089d\3\2"+
		"\2\2\u00aa\u08b5\3\2\2\2\u00ac\u08b9\3\2\2\2\u00ae\u08bb\3\2\2\2\u00b0"+
		"\u08c9\3\2\2\2\u00b2\u090b\3\2\2\2\u00b4\u0911\3\2\2\2\u00b6\u09d9\3\2"+
		"\2\2\u00b8\u09f4\3\2\2\2\u00ba\u09f6\3\2\2\2\u00bc\u09f8\3\2\2\2\u00be"+
		"\u09fa\3\2\2\2\u00c0\u09fc\3\2\2\2\u00c2\u0a0f\3\2\2\2\u00c4\u0a11\3\2"+
		"\2\2\u00c6\u0a1c\3\2\2\2\u00c8\u0a1e\3\2\2\2\u00ca\u0a23\3\2\2\2\u00cc"+
		"\u0a47\3\2\2\2\u00ce\u0a49\3\2\2\2\u00d0\u0a51\3\2\2\2\u00d2\u0a5a\3\2"+
		"\2\2\u00d4\u0a62\3\2\2\2\u00d6\u0a68\3\2\2\2\u00d8\u0a70\3\2\2\2\u00da"+
		"\u0a77\3\2\2\2\u00dc\u0a7c\3\2\2\2\u00de\u0a85\3\2\2\2\u00e0\u0ab7\3\2"+
		"\2\2\u00e2\u0ac9\3\2\2\2\u00e4\u0ad2\3\2\2\2\u00e6\u0ad4\3\2\2\2\u00e8"+
		"\u0adc\3\2\2\2\u00ea\u0ae4\3\2\2\2\u00ec\u0aee\3\2\2\2\u00ee\u0af3\3\2"+
		"\2\2\u00f0\u0afb\3\2\2\2\u00f2\u0afd\3\2\2\2\u00f4\u0b1b\3\2\2\2\u00f6"+
		"\u0b1d\3\2\2\2\u00f8\u0b1f\3\2\2\2\u00fa\u0b21\3\2\2\2\u00fc\u00fd\5\22"+
		"\n\2\u00fd\u00fe\7\2\2\3\u00fe\3\3\2\2\2\u00ff\u0100\5\u00a4S\2\u0100"+
		"\u0101\7\2\2\3\u0101\5\3\2\2\2\u0102\u0103\5\u00a0Q\2\u0103\u0104\7\2"+
		"\2\3\u0104\7\3\2\2\2\u0105\u0106\5\u009eP\2\u0106\u0107\7\2\2\3\u0107"+
		"\t\3\2\2\2\u0108\u0109\5\u00a2R\2\u0109\u010a\7\2\2\3\u010a\13\3\2\2\2"+
		"\u010b\u010c\5\u00ccg\2\u010c\u010d\7\2\2\3\u010d\r\3\2\2\2\u010e\u010f"+
		"\5\u00d2j\2\u010f\u0110\7\2\2\3\u0110\17\3\2\2\2\u0111\u0113\7\66\2\2"+
		"\u0112\u0114\7\u00f1\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0117\7X\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011c\7\u00ed\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7\u00a2\2\2\u011b\u011d\7T\2\2\u011c\u0119\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5\u009eP\2\u011f\u0120\7\3\2"+
		"\2\u0120\u0125\5\u00ceh\2\u0121\u0122\7\4\2\2\u0122\u0124\5\u00ceh\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012f\7\5\2\2\u0129"+
		"\u012a\7.\2\2\u012a\u012e\7\u0127\2\2\u012b\u012c\7\u0091\2\2\u012c\u012e"+
		"\7\u012b\2\2\u012d\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2"+
		"\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0134\7\u009d\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134\21\3\2\2\2\u0135\u0420\5 \21\2\u0136\u0138\5\60\31\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0420\5J&\2\u013a"+
		"\u013c\7\u0107\2\2\u013b\u013d\7\u009e\2\2\u013c\u013b\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0420\5\u009eP\2\u013f\u0140\7\66\2"+
		"\2\u0140\u0144\5*\26\2\u0141\u0142\7p\2\2\u0142\u0143\7\u00a2\2\2\u0143"+
		"\u0145\7T\2\2\u0144\u0141\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u014f\5\u00eav\2\u0147\u0148\7.\2\2\u0148\u014e\7\u0127\2\2"+
		"\u0149\u014e\5\36\20\2\u014a\u014b\7\u0111\2\2\u014b\u014c\7C\2\2\u014c"+
		"\u014e\5\66\34\2\u014d\u0147\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3"+
		"\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0420\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\20\2\2\u0153\u0154\5"+
		"*\26\2\u0154\u0155\5\u00eav\2\u0155\u0156\7\u00de\2\2\u0156\u0157\7C\2"+
		"\2\u0157\u0158\5\66\34\2\u0158\u0420\3\2\2\2\u0159\u015a\7\20\2\2\u015a"+
		"\u015b\5*\26\2\u015b\u015c\5\u00eav\2\u015c\u015d\7\u00de\2\2\u015d\u015e"+
		"\5\36\20\2\u015e\u0420\3\2\2\2\u015f\u0160\7N\2\2\u0160\u0163\5*\26\2"+
		"\u0161\u0162\7p\2\2\u0162\u0164\7T\2\2\u0163\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\5\u00eav\2\u0166\u0168\t\2\2"+
		"\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0420\3\2\2\2\u0169\u016a"+
		"\7\u00e1\2\2\u016a\u016f\7@\2\2\u016b\u016d\7\u0087\2\2\u016c\u016b\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\7\u0127\2\2"+
		"\u016f\u016c\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0420\3\2\2\2\u0171\u0172"+
		"\7\u00e1\2\2\u0172\u0175\7\u009f\2\2\u0173\u0174\t\3\2\2\u0174\u0176\5"+
		"\u009eP\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\3\2\2\2"+
		"\u0177\u0179\7\u0087\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\7\u0127\2\2\u017b\u0178\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u0420\3\2\2\2\u017d\u0182\5\26\f\2\u017e\u017f\7\3\2\2"+
		"\u017f\u0180\5\u00d2j\2\u0180\u0181\7\5\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u017e\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0192\5\64"+
		"\33\2\u0185\u0186\7\u00a9\2\2\u0186\u0191\5\66\34\2\u0187\u0188\7\u00b4"+
		"\2\2\u0188\u0189\7\37\2\2\u0189\u0191\5\u00a8U\2\u018a\u0191\5\32\16\2"+
		"\u018b\u0191\5\36\20\2\u018c\u018d\7.\2\2\u018d\u0191\7\u0127\2\2\u018e"+
		"\u018f\7\u00f0\2\2\u018f\u0191\5\66\34\2\u0190\u0185\3\2\2\2\u0190\u0187"+
		"\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u018c\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0199\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\7\27\2\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\5 "+
		"\21\2\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0420\3\2\2\2\u019b"+
		"\u01a0\5\26\f\2\u019c\u019d\7\3\2\2\u019d\u019e\5\u00d2j\2\u019e\u019f"+
		"\7\5\2\2\u019f\u01a1\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01b8\3\2\2\2\u01a2\u01a3\7.\2\2\u01a3\u01b7\7\u0127\2\2\u01a4\u01a5"+
		"\7\u00b4\2\2\u01a5\u01a6\7\37\2\2\u01a6\u01a7\7\3\2\2\u01a7\u01a8\5\u00d2"+
		"j\2\u01a8\u01a9\7\5\2\2\u01a9\u01ae\3\2\2\2\u01aa\u01ab\7\u00b4\2\2\u01ab"+
		"\u01ac\7\37\2\2\u01ac\u01ae\5\u0088E\2\u01ad\u01a4\3\2\2\2\u01ad\u01aa"+
		"\3\2\2\2\u01ae\u01b7\3\2\2\2\u01af\u01b7\5\32\16\2\u01b0\u01b7\5\34\17"+
		"\2\u01b1\u01b7\5\u009cO\2\u01b2\u01b7\5B\"\2\u01b3\u01b7\5\36\20\2\u01b4"+
		"\u01b5\7\u00f0\2\2\u01b5\u01b7\5\66\34\2\u01b6\u01a2\3\2\2\2\u01b6\u01ad"+
		"\3\2\2\2\u01b6\u01af\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6"+
		"\u01b2\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bf\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bd\7\27\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3"+
		"\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\5 \21\2\u01bf\u01bc\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u0420\3\2\2\2\u01c1\u01c2\7\66\2\2\u01c2\u01c6\7"+
		"\u00ed\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7\u00a2\2\2\u01c5\u01c7\7T\2"+
		"\2\u01c6\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9"+
		"\5\u00a0Q\2\u01c9\u01ca\7\u0087\2\2\u01ca\u01cc\5\u00a0Q\2\u01cb\u01cd"+
		"\5\36\20\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u0420\3\2\2\2"+
		"\u01ce\u01d3\5\30\r\2\u01cf\u01d0\7\3\2\2\u01d0\u01d1\5\u00d2j\2\u01d1"+
		"\u01d2\7\5\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01e3\5\64\33\2\u01d6\u01d7\7\u00a9\2\2"+
		"\u01d7\u01e2\5\66\34\2\u01d8\u01d9\7\u00b4\2\2\u01d9\u01da\7\37\2\2\u01da"+
		"\u01e2\5\u00a8U\2\u01db\u01e2\5\32\16\2\u01dc\u01e2\5\36\20\2\u01dd\u01de"+
		"\7.\2\2\u01de\u01e2\7\u0127\2\2\u01df\u01e0\7\u00f0\2\2\u01e0\u01e2\5"+
		"\66\34\2\u01e1\u01d6\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e1\u01db\3\2\2\2\u01e1"+
		"\u01dc\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ea\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e6\u01e8\7\27\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\5 \21\2\u01ea\u01e7\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u0420\3\2\2\2\u01ec\u01ed\7\21\2\2\u01ed\u01ee\7"+
		"\u00ed\2\2\u01ee\u01f0\5\u00a0Q\2\u01ef\u01f1\5&\24\2\u01f0\u01ef\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7\62\2\2\u01f3"+
		"\u01fb\7\u00e7\2\2\u01f4\u01fc\5\u00eex\2\u01f5\u01f6\7a\2\2\u01f6\u01f7"+
		"\7-\2\2\u01f7\u01fc\5\u008aF\2\u01f8\u01f9\7a\2\2\u01f9\u01fa\7\17\2\2"+
		"\u01fa\u01fc\7-\2\2\u01fb\u01f4\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f8"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0420\3\2\2\2\u01fd\u01fe\7\20\2\2"+
		"\u01fe\u01ff\7\u00ed\2\2\u01ff\u0200\5\u009eP\2\u0200\u0201\7\r\2\2\u0201"+
		"\u0202\t\4\2\2\u0202\u0203\5\u00ceh\2\u0203\u0420\3\2\2\2\u0204\u0205"+
		"\7\20\2\2\u0205\u0206\7\u00ed\2\2\u0206\u0207\5\u009eP\2\u0207\u0208\7"+
		"\r\2\2\u0208\u0209\t\4\2\2\u0209\u020a\7\3\2\2\u020a\u020b\5\u00ceh\2"+
		"\u020b\u020c\7\5\2\2\u020c\u0420\3\2\2\2\u020d\u020e\7\20\2\2\u020e\u020f"+
		"\7\u00ed\2\2\u020f\u0210\5\u009eP\2\u0210\u0211\7\u00c6\2\2\u0211\u0212"+
		"\7,\2\2\u0212\u0213\5\u00e8u\2\u0213\u0214\7\u00f4\2\2\u0214\u0215\5\u00ee"+
		"x\2\u0215\u0420\3\2\2\2\u0216\u0217\7\20\2\2\u0217\u0218\7\u00ed\2\2\u0218"+
		"\u0219\5\u009eP\2\u0219\u021a\7N\2\2\u021a\u021b\t\4\2\2\u021b\u021c\7"+
		"\3\2\2\u021c\u021d\5\u00e6t\2\u021d\u021e\7\5\2\2\u021e\u0420\3\2\2\2"+
		"\u021f\u0220\7\20\2\2\u0220\u0221\7\u00ed\2\2\u0221\u0222\5\u009eP\2\u0222"+
		"\u0223\7N\2\2\u0223\u0224\t\4\2\2\u0224\u0225\5\u00e6t\2\u0225\u0420\3"+
		"\2\2\2\u0226\u0227\7\20\2\2\u0227\u0228\t\5\2\2\u0228\u0229\5\u00a0Q\2"+
		"\u0229\u022a\7\u00c6\2\2\u022a\u022b\7\u00f4\2\2\u022b\u022c\5\u00a0Q"+
		"\2\u022c\u0420\3\2\2\2\u022d\u022e\7\20\2\2\u022e\u022f\t\5\2\2\u022f"+
		"\u0230\5\u009eP\2\u0230\u0231\7\u00de\2\2\u0231\u0232\7\u00f0\2\2\u0232"+
		"\u0233\5\66\34\2\u0233\u0420\3\2\2\2\u0234\u0235\7\20\2\2\u0235\u0236"+
		"\t\5\2\2\u0236\u0237\5\u009eP\2\u0237\u0238\7\u0105\2\2\u0238\u023b\7"+
		"\u00f0\2\2\u0239\u023a\7p\2\2\u023a\u023c\7T\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\5\66\34\2\u023e\u0420\3"+
		"\2\2\2\u023f\u0240\7\20\2\2\u0240\u0241\7\u00ed\2\2\u0241\u0242\5\u009e"+
		"P\2\u0242\u0244\t\6\2\2\u0243\u0245\7,\2\2\u0244\u0243\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\5\u00e8u\2\u0247\u0248\7\u00fd"+
		"\2\2\u0248\u024a\5\u00ccg\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u024c\7.\2\2\u024c\u024e\7\u0127\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\5\u00caf"+
		"\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0420\3\2\2\2\u0252\u0253"+
		"\7\20\2\2\u0253\u0254\7\u00ed\2\2\u0254\u0256\5\u00a0Q\2\u0255\u0257\5"+
		"&\24\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u025a\7$\2\2\u0259\u025b\7,\2\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u025d\5\u00eav\2\u025d\u025f\5\u00d4k\2\u025e"+
		"\u0260\5\u00caf\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0420"+
		"\3\2\2\2\u0261\u0262\7\20\2\2\u0262\u0263\7\u00ed\2\2\u0263\u0265\5\u00a0"+
		"Q\2\u0264\u0266\5&\24\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0268\7\u00de\2\2\u0268\u0269\7\u00db\2\2\u0269\u026d"+
		"\7\u0127\2\2\u026a\u026b\7\u0111\2\2\u026b\u026c\7\u00dc\2\2\u026c\u026e"+
		"\5\66\34\2\u026d\u026a\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0420\3\2\2\2"+
		"\u026f\u0270\7\20\2\2\u0270\u0271\7\u00ed\2\2\u0271\u0273\5\u00a0Q\2\u0272"+
		"\u0274\5&\24\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0276\7\u00de\2\2\u0276\u0277\7\u00dc\2\2\u0277\u0278\5\66"+
		"\34\2\u0278\u0420\3\2\2\2\u0279\u027a\7\20\2\2\u027a\u027b\7\u00ed\2\2"+
		"\u027b\u027c\5\u00a0Q\2\u027c\u0280\7\r\2\2\u027d\u027e\7p\2\2\u027e\u027f"+
		"\7\u00a2\2\2\u027f\u0281\7T\2\2\u0280\u027d\3\2\2\2\u0280\u0281\3\2\2"+
		"\2\u0281\u0283\3\2\2\2\u0282\u0284\5$\23\2\u0283\u0282\3\2\2\2\u0284\u0285"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0420\3\2\2\2\u0287"+
		"\u0288\7\20\2\2\u0288\u0289\7\u010b\2\2\u0289\u028a\5\u00a0Q\2\u028a\u028e"+
		"\7\r\2\2\u028b\u028c\7p\2\2\u028c\u028d\7\u00a2\2\2\u028d\u028f\7T\2\2"+
		"\u028e\u028b\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0292"+
		"\5&\24\2\u0291\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0420\3\2\2\2\u0295\u0296\7\20\2\2\u0296\u0297\7"+
		"\u00ed\2\2\u0297\u0298\5\u00a0Q\2\u0298\u0299\5&\24\2\u0299\u029a\7\u00c6"+
		"\2\2\u029a\u029b\7\u00f4\2\2\u029b\u029c\5&\24\2\u029c\u0420\3\2\2\2\u029d"+
		"\u029e\7\20\2\2\u029e\u029f\7\u00ed\2\2\u029f\u02a0\5\u00a0Q\2\u02a0\u02a3"+
		"\7N\2\2\u02a1\u02a2\7p\2\2\u02a2\u02a4\7T\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02aa\5&\24\2\u02a6\u02a7\7\4"+
		"\2\2\u02a7\u02a9\5&\24\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ad\u02af\7\u00bd\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u0420\3\2\2\2\u02b0\u02b1\7\20\2\2\u02b1\u02b2\7\u010b\2\2\u02b2\u02b3"+
		"\5\u00a0Q\2\u02b3\u02b6\7N\2\2\u02b4\u02b5\7p\2\2\u02b5\u02b7\7T\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bd\5&"+
		"\24\2\u02b9\u02ba\7\4\2\2\u02ba\u02bc\5&\24\2\u02bb\u02b9\3\2\2\2\u02bc"+
		"\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u0420\3\2"+
		"\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7\20\2\2\u02c1\u02c2\7\u00ed\2\2"+
		"\u02c2\u02c3\5\u009eP\2\u02c3\u02c4\7\u00de\2\2\u02c4\u02c5\5\36\20\2"+
		"\u02c5\u0420\3\2\2\2\u02c6\u02c7\7\20\2\2\u02c7\u02c8\7\u00ed\2\2\u02c8"+
		"\u02c9\5\u00a0Q\2\u02c9\u02ca\5&\24\2\u02ca\u02cb\7\u00de\2\2\u02cb\u02cc"+
		"\5\36\20\2\u02cc\u0420\3\2\2\2\u02cd\u02ce\7\20\2\2\u02ce\u02cf\7\u00ed"+
		"\2\2\u02cf\u02d0\5\u00a0Q\2\u02d0\u02d1\7\u00c2\2\2\u02d1\u02d2\7\u00b5"+
		"\2\2\u02d2\u0420\3\2\2\2\u02d3\u02d4\7N\2\2\u02d4\u02d7\7\u00ed\2\2\u02d5"+
		"\u02d6\7p\2\2\u02d6\u02d8\7T\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2"+
		"\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\5\u009eP\2\u02da\u02dc\7\u00bd\2\2"+
		"\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u0420\3\2\2\2\u02dd\u02de"+
		"\7N\2\2\u02de\u02e1\7\u010b\2\2\u02df\u02e0\7p\2\2\u02e0\u02e2\7T\2\2"+
		"\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u0420"+
		"\5\u009eP\2\u02e4\u02e7\7\66\2\2\u02e5\u02e6\7\u00aa\2\2\u02e6\u02e8\7"+
		"\u00c8\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ed\3\2\2\2"+
		"\u02e9\u02eb\7i\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec"+
		"\3\2\2\2\u02ec\u02ee\7\u00f1\2\2\u02ed\u02ea\3\2\2\2\u02ed\u02ee\3\2\2"+
		"\2\u02ee\u02ef\3\2\2\2\u02ef\u02f3\7\u010b\2\2\u02f0\u02f1\7p\2\2\u02f1"+
		"\u02f2\7\u00a2\2\2\u02f2\u02f4\7T\2\2\u02f3\u02f0\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\5\u00a0Q\2\u02f6\u02f8\5\u0090"+
		"I\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0302\3\2\2\2\u02f9"+
		"\u02fa\7.\2\2\u02fa\u0301\7\u0127\2\2\u02fb\u02fc\7\u00b4\2\2\u02fc\u02fd"+
		"\7\u00a6\2\2\u02fd\u0301\5\u0088E\2\u02fe\u02ff\7\u00f0\2\2\u02ff\u0301"+
		"\5\66\34\2\u0300\u02f9\3\2\2\2\u0300\u02fb\3\2\2\2\u0300\u02fe\3\2\2\2"+
		"\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\7\27\2\2\u0306\u0307\5 \21\2"+
		"\u0307\u0420\3\2\2\2\u0308\u030b\7\66\2\2\u0309\u030a\7\u00aa\2\2\u030a"+
		"\u030c\7\u00c8\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e"+
		"\3\2\2\2\u030d\u030f\7i\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\7\u00f1\2\2\u0311\u0312\7\u010b\2\2\u0312\u0317"+
		"\5\u00a0Q\2\u0313\u0314\7\3\2\2\u0314\u0315\5\u00d2j\2\u0315\u0316\7\5"+
		"\2\2\u0316\u0318\3\2\2\2\u0317\u0313\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031c\5\64\33\2\u031a\u031b\7\u00a9\2\2\u031b\u031d"+
		"\5\66\34\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0420\3\2\2\2"+
		"\u031e\u031f\7\20\2\2\u031f\u0320\7\u010b\2\2\u0320\u0322\5\u00a0Q\2\u0321"+
		"\u0323\7\27\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3"+
		"\2\2\2\u0324\u0325\5 \21\2\u0325\u0420\3\2\2\2\u0326\u0329\7\66\2\2\u0327"+
		"\u0328\7\u00aa\2\2\u0328\u032a\7\u00c8\2\2\u0329\u0327\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u032d\7\u00f1\2\2\u032c\u032b\3\2\2"+
		"\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0332\7g\2\2\u032f\u0330"+
		"\7p\2\2\u0330\u0331\7\u00a2\2\2\u0331\u0333\7T\2\2\u0332\u032f\3\2\2\2"+
		"\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\5\u00e8u\2\u0335"+
		"\u0336\7\27\2\2\u0336\u0340\7\u0127\2\2\u0337\u0338\7\u0109\2\2\u0338"+
		"\u033d\5H%\2\u0339\u033a\7\4\2\2\u033a\u033c\5H%\2\u033b\u0339\3\2\2\2"+
		"\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0341"+
		"\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0337\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0420\3\2\2\2\u0342\u0344\7N\2\2\u0343\u0345\7\u00f1\2\2\u0344\u0343"+
		"\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0349\7g\2\2\u0347"+
		"\u0348\7p\2\2\u0348\u034a\7T\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2"+
		"\2\u034a\u034b\3\2\2\2\u034b\u0420\5\u00e8u\2\u034c\u034e\7U\2\2\u034d"+
		"\u034f\t\7\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0420\5\22\n\2\u0351\u0352\7\u00e1\2\2\u0352\u0355\7\u00ee"+
		"\2\2\u0353\u0354\t\3\2\2\u0354\u0356\5\u009eP\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u035b\3\2\2\2\u0357\u0359\7\u0087\2\2\u0358\u0357"+
		"\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\7\u0127\2"+
		"\2\u035b\u0358\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u0420\3\2\2\2\u035d\u035e"+
		"\7\u00e1\2\2\u035e\u035f\7\u00ed\2\2\u035f\u0362\7W\2\2\u0360\u0361\t"+
		"\3\2\2\u0361\u0363\5\u00eav\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2"+
		"\u0363\u0364\3\2\2\2\u0364\u0365\7\u0087\2\2\u0365\u0367\7\u0127\2\2\u0366"+
		"\u0368\5&\24\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0420\3\2"+
		"\2\2\u0369\u036a\7\u00e1\2\2\u036a\u036b\7\u00f0\2\2\u036b\u0370\5\u00a0"+
		"Q\2\u036c\u036d\7\3\2\2\u036d\u036e\5:\36\2\u036e\u036f\7\5\2\2\u036f"+
		"\u0371\3\2\2\2\u0370\u036c\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0420\3\2"+
		"\2\2\u0372\u0373\7\u00e1\2\2\u0373\u0374\7-\2\2\u0374\u0375\t\3\2\2\u0375"+
		"\u0378\5\u00a0Q\2\u0376\u0377\t\3\2\2\u0377\u0379\5\u00eav\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0420\3\2\2\2\u037a\u037b\7\u00e1\2"+
		"\2\u037b\u037c\7\u00b5\2\2\u037c\u037e\5\u00a0Q\2\u037d\u037f\5&\24\2"+
		"\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0420\3\2\2\2\u0380\u0382"+
		"\7\u00e1\2\2\u0381\u0383\5\u00eex\2\u0382\u0381\3\2\2\2\u0382\u0383\3"+
		"\2\2\2\u0383\u0384\3\2\2\2\u0384\u038c\7h\2\2\u0385\u0387\7\u0087\2\2"+
		"\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u038b"+
		"\5\u00e8u\2\u0389\u038b\7\u0127\2\2\u038a\u0388\3\2\2\2\u038a\u0389\3"+
		"\2\2\2\u038b\u038d\3\2\2\2\u038c\u0386\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u0420\3\2\2\2\u038e\u038f\7\u00e1\2\2\u038f\u0390\7\66\2\2\u0390\u0391"+
		"\7\u00ed\2\2\u0391\u0420\5\u00a0Q\2\u0392\u0393\t\b\2\2\u0393\u0395\7"+
		"g\2\2\u0394\u0396\7W\2\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0420\5,\27\2\u0398\u0399\t\b\2\2\u0399\u039b\5*"+
		"\26\2\u039a\u039c\7W\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u039e\5\u00eav\2\u039e\u0420\3\2\2\2\u039f\u03a1"+
		"\t\b\2\2\u03a0\u03a2\7\u00ed\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2"+
		"\2\u03a2\u03a4\3\2\2\2\u03a3\u03a5\t\t\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\5\u009eP\2\u03a7\u03a9\5&\24"+
		"\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03ac"+
		"\5.\30\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u0420\3\2\2\2\u03ad"+
		"\u03af\t\b\2\2\u03ae\u03b0\7\u00be\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u0420\5 \21\2\u03b2\u03b3\7\u00c5\2"+
		"\2\u03b3\u03b4\7\u00ed\2\2\u03b4\u0420\5\u00a0Q\2\u03b5\u03bd\7\u00c5"+
		"\2\2\u03b6\u03be\7\u0127\2\2\u03b7\u03b9\13\2\2\2\u03b8\u03b7\3\2\2\2"+
		"\u03b9\u03bc\3\2\2\2\u03ba\u03bb\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03be"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03b6\3\2\2\2\u03bd\u03ba\3\2\2\2\u03be"+
		"\u0420\3\2\2\2\u03bf\u03c1\7 \2\2\u03c0\u03c2\7\u0084\2\2\u03c1\u03c0"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\7\u00ed\2"+
		"\2\u03c4\u03c7\5\u00a0Q\2\u03c5\u03c6\7\u00a9\2\2\u03c6\u03c8\5\66\34"+
		"\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cd\3\2\2\2\u03c9\u03cb"+
		"\7\27\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2"+
		"\u03cc\u03ce\5 \21\2\u03cd\u03ca\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u0420"+
		"\3\2\2\2\u03cf\u03d0\7\u0100\2\2\u03d0\u03d3\7\u00ed\2\2\u03d1\u03d2\7"+
		"p\2\2\u03d2\u03d4\7T\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u0420\5\u00a0Q\2\u03d6\u03d7\7&\2\2\u03d7\u0420\7"+
		" \2\2\u03d8\u03d9\7\u008b\2\2\u03d9\u03db\7>\2\2\u03da\u03dc\7\u008c\2"+
		"\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de"+
		"\7w\2\2\u03de\u03e0\7\u0127\2\2\u03df\u03e1\7\u00b2\2\2\u03e0\u03df\3"+
		"\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\7|\2\2\u03e3"+
		"\u03e4\7\u00ed\2\2\u03e4\u03e6\5\u00a0Q\2\u03e5\u03e7\5&\24\2\u03e6\u03e5"+
		"\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u0420\3\2\2\2\u03e8\u03e9\7\u00fc\2"+
		"\2\u03e9\u03ea\7\u00ed\2\2\u03ea\u03ec\5\u00a0Q\2\u03eb\u03ed\5&\24\2"+
		"\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u0420\3\2\2\2\u03ee\u03ef"+
		"\7\u009c\2\2\u03ef\u03f0\7\u00c7\2\2\u03f0\u03f1\7\u00ed\2\2\u03f1\u0420"+
		"\5\u00a0Q\2\u03f2\u03f3\t\n\2\2\u03f3\u03f7\5\u00eex\2\u03f4\u03f6\13"+
		"\2\2\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f7"+
		"\u03f5\3\2\2\2\u03f8\u0420\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\u00de"+
		"\2\2\u03fb\u03ff\7\u00cf\2\2\u03fc\u03fe\13\2\2\2\u03fd\u03fc\3\2\2\2"+
		"\u03fe\u0401\3\2\2\2\u03ff\u0400\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0420"+
		"\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0406\7\u00de\2\2\u0403\u0405\13\2"+
		"\2\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0407\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0407\u0420\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u0420\7\u00c9"+
		"\2\2\u040a\u040b\7E\2\2\u040b\u040c\7e\2\2\u040c\u040d\5\u009eP\2\u040d"+
		"\u040f\5\u009aN\2\u040e\u0410\5d\63\2\u040f\u040e\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0420\3\2\2\2\u0411\u0412\7\u0106\2\2\u0412\u0413\5\u009e"+
		"P\2\u0413\u0414\5\u009aN\2\u0414\u0416\5`\61\2\u0415\u0417\5d\63\2\u0416"+
		"\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0420\3\2\2\2\u0418\u041c\5\24"+
		"\13\2\u0419\u041b\13\2\2\2\u041a\u0419\3\2\2\2\u041b\u041e\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2"+
		"\2\2\u041f\u0135\3\2\2\2\u041f\u0137\3\2\2\2\u041f\u013a\3\2\2\2\u041f"+
		"\u013f\3\2\2\2\u041f\u0152\3\2\2\2\u041f\u0159\3\2\2\2\u041f\u015f\3\2"+
		"\2\2\u041f\u0169\3\2\2\2\u041f\u0171\3\2\2\2\u041f\u017d\3\2\2\2\u041f"+
		"\u019b\3\2\2\2\u041f\u01c1\3\2\2\2\u041f\u01ce\3\2\2\2\u041f\u01ec\3\2"+
		"\2\2\u041f\u01fd\3\2\2\2\u041f\u0204\3\2\2\2\u041f\u020d\3\2\2\2\u041f"+
		"\u0216\3\2\2\2\u041f\u021f\3\2\2\2\u041f\u0226\3\2\2\2\u041f\u022d\3\2"+
		"\2\2\u041f\u0234\3\2\2\2\u041f\u023f\3\2\2\2\u041f\u0252\3\2\2\2\u041f"+
		"\u0261\3\2\2\2\u041f\u026f\3\2\2\2\u041f\u0279\3\2\2\2\u041f\u0287\3\2"+
		"\2\2\u041f\u0295\3\2\2\2\u041f\u029d\3\2\2\2\u041f\u02b0\3\2\2\2\u041f"+
		"\u02c0\3\2\2\2\u041f\u02c6\3\2\2\2\u041f\u02cd\3\2\2\2\u041f\u02d3\3\2"+
		"\2\2\u041f\u02dd\3\2\2\2\u041f\u02e4\3\2\2\2\u041f\u0308\3\2\2\2\u041f"+
		"\u031e\3\2\2\2\u041f\u0326\3\2\2\2\u041f\u0342\3\2\2\2\u041f\u034c\3\2"+
		"\2\2\u041f\u0351\3\2\2\2\u041f\u035d\3\2\2\2\u041f\u0369\3\2\2\2\u041f"+
		"\u0372\3\2\2\2\u041f\u037a\3\2\2\2\u041f\u0380\3\2\2\2\u041f\u038e\3\2"+
		"\2\2\u041f\u0392\3\2\2\2\u041f\u0398\3\2\2\2\u041f\u039f\3\2\2\2\u041f"+
		"\u03ad\3\2\2\2\u041f\u03b2\3\2\2\2\u041f\u03b5\3\2\2\2\u041f\u03bf\3\2"+
		"\2\2\u041f\u03cf\3\2\2\2\u041f\u03d6\3\2\2\2\u041f\u03d8\3\2\2\2\u041f"+
		"\u03e8\3\2\2\2\u041f\u03ee\3\2\2\2\u041f\u03f2\3\2\2\2\u041f\u03fa\3\2"+
		"\2\2\u041f\u0402\3\2\2\2\u041f\u0409\3\2\2\2\u041f\u040a\3\2\2\2\u041f"+
		"\u0411\3\2\2\2\u041f\u0418\3\2\2\2\u0420\23\3\2\2\2\u0421\u0422\7\66\2"+
		"\2\u0422\u04cc\7\u00cf\2\2\u0423\u0424\7N\2\2\u0424\u04cc\7\u00cf\2\2"+
		"\u0425\u0427\7j\2\2\u0426\u0428\7\u00cf\2\2\u0427\u0426\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u04cc\3\2\2\2\u0429\u042b\7\u00cc\2\2\u042a\u042c"+
		"\7\u00cf\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u04cc\3\2\2"+
		"\2\u042d\u042e\7\u00e1\2\2\u042e\u04cc\7j\2\2\u042f\u0430\7\u00e1\2\2"+
		"\u0430\u0432\7\u00cf\2\2\u0431\u0433\7j\2\2\u0432\u0431\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u04cc\3\2\2\2\u0434\u0435\7\u00e1\2\2\u0435\u04cc"+
		"\7\u00bc\2\2\u0436\u0437\7\u00e1\2\2\u0437\u04cc\7\u00d0\2\2\u0438\u0439"+
		"\7\u00e1\2\2\u0439\u043a\79\2\2\u043a\u04cc\7\u00d0\2\2\u043b\u043c\7"+
		"V\2\2\u043c\u04cc\7\u00ed\2\2\u043d\u043e\7r\2\2\u043e\u04cc\7\u00ed\2"+
		"\2\u043f\u0440\7\u00e1\2\2\u0440\u04cc\7\61\2\2\u0441\u0442\7\u00e1\2"+
		"\2\u0442\u0443\7\66\2\2\u0443\u04cc\7\u00ed\2\2\u0444\u0445\7\u00e1\2"+
		"\2\u0445\u04cc\7\u00f8\2\2\u0446\u0447\7\u00e1\2\2\u0447\u04cc\7u\2\2"+
		"\u0448\u0449\7\u00e1\2\2\u0449\u04cc\7\u008f\2\2\u044a\u044b\7\66\2\2"+
		"\u044b\u04cc\7t\2\2\u044c\u044d\7N\2\2\u044d\u04cc\7t\2\2\u044e\u044f"+
		"\7\20\2\2\u044f\u04cc\7t\2\2\u0450\u0451\7\u008e\2\2\u0451\u04cc\7\u00ed"+
		"\2\2\u0452\u0453\7\u008e\2\2\u0453\u04cc\7?\2\2\u0454\u0455\7\u0104\2"+
		"\2\u0455\u04cc\7\u00ed\2\2\u0456\u0457\7\u0104\2\2\u0457\u04cc\7?\2\2"+
		"\u0458\u0459\7\66\2\2\u0459\u045a\7\u00f1\2\2\u045a\u04cc\7\u0092\2\2"+
		"\u045b\u045c\7N\2\2\u045c\u045d\7\u00f1\2\2\u045d\u04cc\7\u0092\2\2\u045e"+
		"\u045f\7\20\2\2\u045f\u0460\7\u00ed\2\2\u0460\u0461\5\u00a0Q\2\u0461\u0462"+
		"\7\u00a2\2\2\u0462\u0463\7(\2\2\u0463\u04cc\3\2\2\2\u0464\u0465\7\20\2"+
		"\2\u0465\u0466\7\u00ed\2\2\u0466\u0467\5\u00a0Q\2\u0467\u0468\7(\2\2\u0468"+
		"\u0469\7\37\2\2\u0469\u04cc\3\2\2\2\u046a\u046b\7\20\2\2\u046b\u046c\7"+
		"\u00ed\2\2\u046c\u046d\5\u00a0Q\2\u046d\u046e\7\u00a2\2\2\u046e\u046f"+
		"\7\u00e5\2\2\u046f\u04cc\3\2\2\2\u0470\u0471\7\20\2\2\u0471\u0472\7\u00ed"+
		"\2\2\u0472\u0473\5\u00a0Q\2\u0473\u0474\7\u00e2\2\2\u0474\u0475\7\37\2"+
		"\2\u0475\u04cc\3\2\2\2\u0476\u0477\7\20\2\2\u0477\u0478\7\u00ed\2\2\u0478"+
		"\u0479\5\u00a0Q\2\u0479\u047a\7\u00a2\2\2\u047a\u047b\7\u00e2\2\2\u047b"+
		"\u04cc\3\2\2\2\u047c\u047d\7\20\2\2\u047d\u047e\7\u00ed\2\2\u047e\u047f"+
		"\5\u00a0Q\2\u047f\u0480\7\u00a2\2\2\u0480\u0481\7\u00e8\2\2\u0481\u0482"+
		"\7\27\2\2\u0482\u0483\7J\2\2\u0483\u04cc\3\2\2\2\u0484\u0485\7\20\2\2"+
		"\u0485\u0486\7\u00ed\2\2\u0486\u0487\5\u00a0Q\2\u0487\u0488\7\u00de\2"+
		"\2\u0488\u0489\7\u00e2\2\2\u0489\u048a\7\u008d\2\2\u048a\u04cc\3\2\2\2"+
		"\u048b\u048c\7\20\2\2\u048c\u048d\7\u00ed\2\2\u048d\u048e\5\u00a0Q\2\u048e"+
		"\u048f\7S\2\2\u048f\u0490\7\u00b3\2\2\u0490\u04cc\3\2\2\2\u0491\u0492"+
		"\7\20\2\2\u0492\u0493\7\u00ed\2\2\u0493\u0494\5\u00a0Q\2\u0494\u0495\7"+
		"\25\2\2\u0495\u0496\7\u00b3\2\2\u0496\u04cc\3\2\2\2\u0497\u0498\7\20\2"+
		"\2\u0498\u0499\7\u00ed\2\2\u0499\u049a\5\u00a0Q\2\u049a\u049b\7\u00fe"+
		"\2\2\u049b\u049c\7\u00b3\2\2\u049c\u04cc\3\2\2\2\u049d\u049e\7\20\2\2"+
		"\u049e\u049f\7\u00ed\2\2\u049f\u04a0\5\u00a0Q\2\u04a0\u04a1\7\u00f5\2"+
		"\2\u04a1\u04cc\3\2\2\2\u04a2\u04a3\7\20\2\2\u04a3\u04a4\7\u00ed\2\2\u04a4"+
		"\u04a6\5\u00a0Q\2\u04a5\u04a7\5&\24\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\7\60\2\2\u04a9\u04cc\3\2\2\2"+
		"\u04aa\u04ab\7\20\2\2\u04ab\u04ac\7\u00ed\2\2\u04ac\u04ae\5\u00a0Q\2\u04ad"+
		"\u04af\5&\24\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2"+
		"\2\2\u04b0\u04b1\7\63\2\2\u04b1\u04cc\3\2\2\2\u04b2\u04b3\7\20\2\2\u04b3"+
		"\u04b4\7\u00ed\2\2\u04b4\u04b6\5\u00a0Q\2\u04b5\u04b7\5&\24\2\u04b6\u04b5"+
		"\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7\u00de\2"+
		"\2\u04b9\u04ba\7]\2\2\u04ba\u04cc\3\2\2\2\u04bb\u04bc\7\20\2\2\u04bc\u04bd"+
		"\7\u00ed\2\2\u04bd\u04bf\5\u00a0Q\2\u04be\u04c0\5&\24\2\u04bf\u04be\3"+
		"\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7\u00c8\2\2"+
		"\u04c2\u04c3\7-\2\2\u04c3\u04cc\3\2\2\2\u04c4\u04c5\7\u00e6\2\2\u04c5"+
		"\u04cc\7\u00f7\2\2\u04c6\u04cc\7/\2\2\u04c7\u04cc\7\u00d1\2\2\u04c8\u04cc"+
		"\7I\2\2\u04c9\u04ca\7E\2\2\u04ca\u04cc\7e\2\2\u04cb\u0421\3\2\2\2\u04cb"+
		"\u0423\3\2\2\2\u04cb\u0425\3\2\2\2\u04cb\u0429\3\2\2\2\u04cb\u042d\3\2"+
		"\2\2\u04cb\u042f\3\2\2\2\u04cb\u0434\3\2\2\2\u04cb\u0436\3\2\2\2\u04cb"+
		"\u0438\3\2\2\2\u04cb\u043b\3\2\2\2\u04cb\u043d\3\2\2\2\u04cb\u043f\3\2"+
		"\2\2\u04cb\u0441\3\2\2\2\u04cb\u0444\3\2\2\2\u04cb\u0446\3\2\2\2\u04cb"+
		"\u0448\3\2\2\2\u04cb\u044a\3\2\2\2\u04cb\u044c\3\2\2\2\u04cb\u044e\3\2"+
		"\2\2\u04cb\u0450\3\2\2\2\u04cb\u0452\3\2\2\2\u04cb\u0454\3\2\2\2\u04cb"+
		"\u0456\3\2\2\2\u04cb\u0458\3\2\2\2\u04cb\u045b\3\2\2\2\u04cb\u045e\3\2"+
		"\2\2\u04cb\u0464\3\2\2\2\u04cb\u046a\3\2\2\2\u04cb\u0470\3\2\2\2\u04cb"+
		"\u0476\3\2\2\2\u04cb\u047c\3\2\2\2\u04cb\u0484\3\2\2\2\u04cb\u048b\3\2"+
		"\2\2\u04cb\u0491\3\2\2\2\u04cb\u0497\3\2\2\2\u04cb\u049d\3\2\2\2\u04cb"+
		"\u04a2\3\2\2\2\u04cb\u04aa\3\2\2\2\u04cb\u04b2\3\2\2\2\u04cb\u04bb\3\2"+
		"\2\2\u04cb\u04c4\3\2\2\2\u04cb\u04c6\3\2\2\2\u04cb\u04c7\3\2\2\2\u04cb"+
		"\u04c8\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\25\3\2\2\2\u04cd\u04cf\7\66\2"+
		"\2\u04ce\u04d0\7\u00f1\2\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
		"\u04d2\3\2\2\2\u04d1\u04d3\7X\2\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d8\7\u00ed\2\2\u04d5\u04d6\7p\2\2\u04d6"+
		"\u04d7\7\u00a2\2\2\u04d7\u04d9\7T\2\2\u04d8\u04d5\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\5\u009eP\2\u04db\27\3\2\2\2\u04dc"+
		"\u04dd\7\66\2\2\u04dd\u04df\7\u00aa\2\2\u04de\u04dc\3\2\2\2\u04de\u04df"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7\u00c8\2\2\u04e1\u04e2\7\u00ed"+
		"\2\2\u04e2\u04e3\5\u009eP\2\u04e3\31\3\2\2\2\u04e4\u04e5\7(\2\2\u04e5"+
		"\u04e6\7\37\2\2\u04e6\u04ea\5\u0088E\2\u04e7\u04e8\7\u00e5\2\2\u04e8\u04e9"+
		"\7\37\2\2\u04e9\u04eb\5\u008cG\2\u04ea\u04e7\3\2\2\2\u04ea\u04eb\3\2\2"+
		"\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\7|\2\2\u04ed\u04ee\7\u012b\2\2\u04ee"+
		"\u04ef\7\36\2\2\u04ef\33\3\2\2\2\u04f0\u04f1\7\u00e2\2\2\u04f1\u04f2\7"+
		"\37\2\2\u04f2\u04f3\5\u0088E\2\u04f3\u04f6\7\u00a6\2\2\u04f4\u04f7\5>"+
		" \2\u04f5\u04f7\5@!\2\u04f6\u04f4\3\2\2\2\u04f6\u04f5\3\2\2\2\u04f7\u04fb"+
		"\3\2\2\2\u04f8\u04f9\7\u00e8\2\2\u04f9\u04fa\7\27\2\2\u04fa\u04fc\7J\2"+
		"\2\u04fb\u04f8\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\35\3\2\2\2\u04fd\u04fe"+
		"\7\u008d\2\2\u04fe\u04ff\7\u0127\2\2\u04ff\37\3\2\2\2\u0500\u0502\5\60"+
		"\31\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0504\5P)\2\u0504\u0505\5L\'\2\u0505!\3\2\2\2\u0506\u0507\7y\2\2\u0507"+
		"\u0509\7\u00b2\2\2\u0508\u050a\7\u00ed\2\2\u0509\u0508\3\2\2\2\u0509\u050a"+
		"\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u0512\5\u009eP\2\u050c\u0510\5&\24"+
		"\2\u050d\u050e\7p\2\2\u050e\u050f\7\u00a2\2\2\u050f\u0511\7T\2\2\u0510"+
		"\u050d\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u050c\3\2"+
		"\2\2\u0512\u0513\3\2\2\2\u0513\u053e\3\2\2\2\u0514\u0515\7y\2\2\u0515"+
		"\u0517\7|\2\2\u0516\u0518\7\u00ed\2\2\u0517\u0516\3\2\2\2\u0517\u0518"+
		"\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\5\u009eP\2\u051a\u051c\5&\24"+
		"\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u0520\3\2\2\2\u051d\u051e"+
		"\7p\2\2\u051e\u051f\7\u00a2\2\2\u051f\u0521\7T\2\2\u0520\u051d\3\2\2\2"+
		"\u0520\u0521\3\2\2\2\u0521\u053e\3\2\2\2\u0522\u0523\7y\2\2\u0523\u0525"+
		"\7\u00b2\2\2\u0524\u0526\7\u008c\2\2\u0525\u0524\3\2\2\2\u0525\u0526\3"+
		"\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\7K\2\2\u0528\u052a\7\u0127\2\2"+
		"\u0529\u052b\5\u009cO\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052d\3\2\2\2\u052c\u052e\5B\"\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2"+
		"\2\2\u052e\u053e\3\2\2\2\u052f\u0530\7y\2\2\u0530\u0532\7\u00b2\2\2\u0531"+
		"\u0533\7\u008c\2\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0536\7K\2\2\u0535\u0537\7\u0127\2\2\u0536\u0535\3\2\2"+
		"\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053b\5\64\33\2\u0539"+
		"\u053a\7\u00a9\2\2\u053a\u053c\5\66\34\2\u053b\u0539\3\2\2\2\u053b\u053c"+
		"\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u0506\3\2\2\2\u053d\u0514\3\2\2\2\u053d"+
		"\u0522\3\2\2\2\u053d\u052f\3\2\2\2\u053e#\3\2\2\2\u053f\u0541\5&\24\2"+
		"\u0540\u0542\5\36\20\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542%"+
		"\3\2\2\2\u0543\u0544\7\u00b3\2\2\u0544\u0545\7\3\2\2\u0545\u054a\5(\25"+
		"\2\u0546\u0547\7\4\2\2\u0547\u0549\5(\25\2\u0548\u0546\3\2\2\2\u0549\u054c"+
		"\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u054e\7\5\2\2\u054e\'\3\2\2\2\u054f\u0552\5\u00ee"+
		"x\2\u0550\u0551\7\u0114\2\2\u0551\u0553\5\u00b8]\2\u0552\u0550\3\2\2\2"+
		"\u0552\u0553\3\2\2\2\u0553)\3\2\2\2\u0554\u0555\t\13\2\2\u0555+\3\2\2"+
		"\2\u0556\u055c\5\u00e8u\2\u0557\u055c\7\u0127\2\2\u0558\u055c\5\u00ba"+
		"^\2\u0559\u055c\5\u00bc_\2\u055a\u055c\5\u00be`\2\u055b\u0556\3\2\2\2"+
		"\u055b\u0557\3\2\2\2\u055b\u0558\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055a"+
		"\3\2\2\2\u055c-\3\2\2\2\u055d\u0562\5\u00eex\2\u055e\u055f\7\6\2\2\u055f"+
		"\u0561\5\u00eex\2\u0560\u055e\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560"+
		"\3\2\2\2\u0562\u0563\3\2\2\2\u0563/\3\2\2\2\u0564\u0562\3\2\2\2\u0565"+
		"\u0566\7\u0111\2\2\u0566\u056b\5\62\32\2\u0567\u0568\7\4\2\2\u0568\u056a"+
		"\5\62\32\2\u0569\u0567\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2"+
		"\u056b\u056c\3\2\2\2\u056c\61\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u0570"+
		"\5\u00eav\2\u056f\u0571\5\u0088E\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2"+
		"\2\2\u0571\u0573\3\2\2\2\u0572\u0574\7\27\2\2\u0573\u0572\3\2\2\2\u0573"+
		"\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\7\3\2\2\u0576\u0577\5 "+
		"\21\2\u0577\u0578\7\5\2\2\u0578\63\3\2\2\2\u0579\u057a\7\u0109\2\2\u057a"+
		"\u057b\5\u00e8u\2\u057b\65\3\2\2\2\u057c\u057d\7\3\2\2\u057d\u0582\58"+
		"\35\2\u057e\u057f\7\4\2\2\u057f\u0581\58\35\2\u0580\u057e\3\2\2\2\u0581"+
		"\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2"+
		"\2\2\u0584\u0582\3\2\2\2\u0585\u0586\7\5\2\2\u0586\67\3\2\2\2\u0587\u058c"+
		"\5:\36\2\u0588\u058a\7\u0114\2\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2\2"+
		"\2\u058a\u058b\3\2\2\2\u058b\u058d\5<\37\2\u058c\u0589\3\2\2\2\u058c\u058d"+
		"\3\2\2\2\u058d9\3\2\2\2\u058e\u0593\5\u00eex\2\u058f\u0590\7\6\2\2\u0590"+
		"\u0592\5\u00eex\2\u0591\u058f\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591"+
		"\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0598\3\2\2\2\u0595\u0593\3\2\2\2\u0596"+
		"\u0598\7\u0127\2\2\u0597\u058e\3\2\2\2\u0597\u0596\3\2\2\2\u0598;\3\2"+
		"\2\2\u0599\u059e\7\u012b\2\2\u059a\u059e\7\u012c\2\2\u059b\u059e\5\u00c0"+
		"a\2\u059c\u059e\7\u0127\2\2\u059d\u0599\3\2\2\2\u059d\u059a\3\2\2\2\u059d"+
		"\u059b\3\2\2\2\u059d\u059c\3\2\2\2\u059e=\3\2\2\2\u059f\u05a0\7\3\2\2"+
		"\u05a0\u05a5\5\u00b8]\2\u05a1\u05a2\7\4\2\2\u05a2\u05a4\5\u00b8]\2\u05a3"+
		"\u05a1\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2"+
		"\2\2\u05a6\u05a8\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05a9\7\5\2\2\u05a9"+
		"?\3\2\2\2\u05aa\u05ab\7\3\2\2\u05ab\u05b0\5> \2\u05ac\u05ad\7\4\2\2\u05ad"+
		"\u05af\5> \2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2"+
		"\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b4"+
		"\7\5\2\2\u05b4A\3\2\2\2\u05b5\u05b6\7\u00e8\2\2\u05b6\u05b7\7\27\2\2\u05b7"+
		"\u05bc\5D#\2\u05b8\u05b9\7\u00e8\2\2\u05b9\u05ba\7\37\2\2\u05ba\u05bc"+
		"\5F$\2\u05bb\u05b5\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bcC\3\2\2\2\u05bd\u05be"+
		"\7x\2\2\u05be\u05bf\7\u0127\2\2\u05bf\u05c0\7\u00ae\2\2\u05c0\u05c3\7"+
		"\u0127\2\2\u05c1\u05c3\5\u00eex\2\u05c2\u05bd\3\2\2\2\u05c2\u05c1\3\2"+
		"\2\2\u05c3E\3\2\2\2\u05c4\u05c8\7\u0127\2\2\u05c5\u05c6\7\u0111\2\2\u05c6"+
		"\u05c7\7\u00dc\2\2\u05c7\u05c9\5\66\34\2\u05c8\u05c5\3\2\2\2\u05c8\u05c9"+
		"\3\2\2\2\u05c9G\3\2\2\2\u05ca\u05cb\5\u00eex\2\u05cb\u05cc\7\u0127\2\2"+
		"\u05ccI\3\2\2\2\u05cd\u05ce\5\"\22\2\u05ce\u05cf\5P)\2\u05cf\u05d0\5L"+
		"\'\2\u05d0\u05d8\3\2\2\2\u05d1\u05d3\5l\67\2\u05d2\u05d4\5N(\2\u05d3\u05d2"+
		"\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6"+
		"\u05d8\3\2\2\2\u05d7\u05cd\3\2\2\2\u05d7\u05d1\3\2\2\2\u05d8K\3\2\2\2"+
		"\u05d9\u05da\7\u00ab\2\2\u05da\u05db\7\37\2\2\u05db\u05e0\5T+\2\u05dc"+
		"\u05dd\7\4\2\2\u05dd\u05df\5T+\2\u05de\u05dc\3\2\2\2\u05df\u05e2\3\2\2"+
		"\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0"+
		"\3\2\2\2\u05e3\u05d9\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05ef\3\2\2\2\u05e5"+
		"\u05e6\7\'\2\2\u05e6\u05e7\7\37\2\2\u05e7\u05ec\5\u00aeX\2\u05e8\u05e9"+
		"\7\4\2\2\u05e9\u05eb\5\u00aeX\2\u05ea\u05e8\3\2\2\2\u05eb\u05ee\3\2\2"+
		"\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec"+
		"\3\2\2\2\u05ef\u05e5\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05fb\3\2\2\2\u05f1"+
		"\u05f2\7M\2\2\u05f2\u05f3\7\37\2\2\u05f3\u05f8\5\u00aeX\2\u05f4\u05f5"+
		"\7\4\2\2\u05f5\u05f7\5\u00aeX\2\u05f6\u05f4\3\2\2\2\u05f7\u05fa\3\2\2"+
		"\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8"+
		"\3\2\2\2\u05fb\u05f1\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u0607\3\2\2\2\u05fd"+
		"\u05fe\7\u00e4\2\2\u05fe\u05ff\7\37\2\2\u05ff\u0604\5T+\2\u0600\u0601"+
		"\7\4\2\2\u0601\u0603\5T+\2\u0602\u0600\3\2\2\2\u0603\u0606\3\2\2\2\u0604"+
		"\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0608\3\2\2\2\u0606\u0604\3\2"+
		"\2\2\u0607\u05fd\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609"+
		"\u060b\5\u00dco\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u0611"+
		"\3\2\2\2\u060c\u060f\7\u0088\2\2\u060d\u0610\7\17\2\2\u060e\u0610\5\u00ae"+
		"X\2\u060f\u060d\3\2\2\2\u060f\u060e\3\2\2\2\u0610\u0612\3\2\2\2\u0611"+
		"\u060c\3\2\2\2\u0611\u0612\3\2\2\2\u0612M\3\2\2\2\u0613\u0614\5\"\22\2"+
		"\u0614\u0615\5X-\2\u0615O\3\2\2\2\u0616\u0617\b)\1\2\u0617\u0618\5R*\2"+
		"\u0618\u0630\3\2\2\2\u0619\u061a\f\5\2\2\u061a\u061b\6)\3\2\u061b\u061d"+
		"\t\f\2\2\u061c\u061e\5z>\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u062f\5P)\6\u0620\u0621\f\4\2\2\u0621\u0622\6)\5"+
		"\2\u0622\u0624\7z\2\2\u0623\u0625\5z>\2\u0624\u0623\3\2\2\2\u0624\u0625"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u062f\5P)\5\u0627\u0628\f\3\2\2\u0628"+
		"\u0629\6)\7\2\u0629\u062b\t\r\2\2\u062a\u062c\5z>\2\u062b\u062a\3\2\2"+
		"\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\5P)\4\u062e\u0619"+
		"\3\2\2\2\u062e\u0620\3\2\2\2\u062e\u0627\3\2\2\2\u062f\u0632\3\2\2\2\u0630"+
		"\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631Q\3\2\2\2\u0632\u0630\3\2\2\2"+
		"\u0633\u063d\5Z.\2\u0634\u063d\5V,\2\u0635\u0636\7\u00ed\2\2\u0636\u063d"+
		"\5\u009eP\2\u0637\u063d\5\u0096L\2\u0638\u0639\7\3\2\2\u0639\u063a\5 "+
		"\21\2\u063a\u063b\7\5\2\2\u063b\u063d\3\2\2\2\u063c\u0633\3\2\2\2\u063c"+
		"\u0634\3\2\2\2\u063c\u0635\3\2\2\2\u063c\u0637\3\2\2\2\u063c\u0638\3\2"+
		"\2\2\u063dS\3\2\2\2\u063e\u0640\5\u00aeX\2\u063f\u0641\t\16\2\2\u0640"+
		"\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0643\7\u00a4"+
		"\2\2\u0643\u0645\t\17\2\2\u0644\u0642\3\2\2\2\u0644\u0645\3\2\2\2\u0645"+
		"U\3\2\2\2\u0646\u0648\5l\67\2\u0647\u0649\5X-\2\u0648\u0647\3\2\2\2\u0649"+
		"\u064a\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064bW\3\2\2\2"+
		"\u064c\u064e\5\\/\2\u064d\u064f\5d\63\2\u064e\u064d\3\2\2\2\u064e\u064f"+
		"\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\5L\'\2\u0651\u0668\3\2\2\2\u0652"+
		"\u0656\5^\60\2\u0653\u0655\5x=\2\u0654\u0653\3\2\2\2\u0655\u0658\3\2\2"+
		"\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656"+
		"\3\2\2\2\u0659\u065b\5d\63\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u065d\3\2\2\2\u065c\u065e\5n8\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2"+
		"\2\u065e\u0660\3\2\2\2\u065f\u0661\5f\64\2\u0660\u065f\3\2\2\2\u0660\u0661"+
		"\3\2\2\2\u0661\u0663\3\2\2\2\u0662\u0664\5\u00dco\2\u0663\u0662\3\2\2"+
		"\2\u0663\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\5L\'\2\u0666\u0668"+
		"\3\2\2\2\u0667\u064c\3\2\2\2\u0667\u0652\3\2\2\2\u0668Y\3\2\2\2\u0669"+
		"\u066b\5\\/\2\u066a\u066c\5l\67\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2"+
		"\2\2\u066c\u066e\3\2\2\2\u066d\u066f\5d\63\2\u066e\u066d\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u0687\3\2\2\2\u0670\u0672\5^\60\2\u0671\u0673\5l"+
		"\67\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0677\3\2\2\2\u0674"+
		"\u0676\5x=\2\u0675\u0674\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675\3\2\2"+
		"\2\u0677\u0678\3\2\2\2\u0678\u067b\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u067c"+
		"\5d\63\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2\2\2\u067d"+
		"\u067f\5n8\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0681\3\2\2"+
		"\2\u0680\u0682\5f\64\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0684"+
		"\3\2\2\2\u0683\u0685\5\u00dco\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2"+
		"\2\u0685\u0687\3\2\2\2\u0686\u0669\3\2\2\2\u0686\u0670\3\2\2\2\u0687["+
		"\3\2\2\2\u0688\u0689\7\u00d8\2\2\u0689\u068a\7\u00f9\2\2\u068a\u068b\7"+
		"\3\2\2\u068b\u068c\5\u00a6T\2\u068c\u068d\7\5\2\2\u068d\u0693\3\2\2\2"+
		"\u068e\u068f\7\u0093\2\2\u068f\u0693\5\u00a6T\2\u0690\u0691\7\u00c3\2"+
		"\2\u0691\u0693\5\u00a6T\2\u0692\u0688\3\2\2\2\u0692\u068e\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0696\5\u009cO\2\u0695\u0694"+
		"\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0699\3\2\2\2\u0697\u0698\7\u00c1\2"+
		"\2\u0698\u069a\7\u0127\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u069b\3\2\2\2\u069b\u069c\7\u0109\2\2\u069c\u06a9\7\u0127\2\2\u069d\u06a7"+
		"\7\27\2\2\u069e\u06a8\5\u008aF\2\u069f\u06a8\5\u00d2j\2\u06a0\u06a3\7"+
		"\3\2\2\u06a1\u06a4\5\u008aF\2\u06a2\u06a4\5\u00d2j\2\u06a3\u06a1\3\2\2"+
		"\2\u06a3\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\7\5\2\2\u06a6\u06a8"+
		"\3\2\2\2\u06a7\u069e\3\2\2\2\u06a7\u069f\3\2\2\2\u06a7\u06a0\3\2\2\2\u06a8"+
		"\u06aa\3\2\2\2\u06a9\u069d\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ac\3\2"+
		"\2\2\u06ab\u06ad\5\u009cO\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad"+
		"\u06b0\3\2\2\2\u06ae\u06af\7\u00c0\2\2\u06af\u06b1\7\u0127\2\2\u06b0\u06ae"+
		"\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1]\3\2\2\2\u06b2\u06b6\7\u00d8\2\2\u06b3"+
		"\u06b5\5h\65\2\u06b4\u06b3\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4\3\2"+
		"\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9"+
		"\u06bb\5z>\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\3\2\2"+
		"\2\u06bc\u06bd\5\u00a6T\2\u06bd_\3\2\2\2\u06be\u06bf\7\u00de\2\2\u06bf"+
		"\u06c4\5b\62\2\u06c0\u06c1\7\4\2\2\u06c1\u06c3\5b\62\2\u06c2\u06c0\3\2"+
		"\2\2\u06c3\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"a\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06c8\5\u009eP\2\u06c8\u06c9\7\u0114"+
		"\2\2\u06c9\u06ca\5\u00aeX\2\u06cac\3\2\2\2\u06cb\u06cc\7\u010f\2\2\u06cc"+
		"\u06cd\5\u00b0Y\2\u06cde\3\2\2\2\u06ce\u06cf\7m\2\2\u06cf\u06d0\5\u00b0"+
		"Y\2\u06d0g\3\2\2\2\u06d1\u06d2\7\7\2\2\u06d2\u06d9\5j\66\2\u06d3\u06d5"+
		"\7\4\2\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6"+
		"\u06d8\5j\66\2\u06d7\u06d4\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9\u06d7\3\2"+
		"\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06d9\3\2\2\2\u06dc"+
		"\u06dd\7\b\2\2\u06ddi\3\2\2\2\u06de\u06ec\5\u00eex\2\u06df\u06e0\5\u00ee"+
		"x\2\u06e0\u06e1\7\3\2\2\u06e1\u06e6\5\u00b6\\\2\u06e2\u06e3\7\4\2\2\u06e3"+
		"\u06e5\5\u00b6\\\2\u06e4\u06e2\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4"+
		"\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e9"+
		"\u06ea\7\5\2\2\u06ea\u06ec\3\2\2\2\u06eb\u06de\3\2\2\2\u06eb\u06df\3\2"+
		"\2\2\u06eck\3\2\2\2\u06ed\u06ee\7e\2\2\u06ee\u06f3\5|?\2\u06ef\u06f0\7"+
		"\4\2\2\u06f0\u06f2\5|?\2\u06f1\u06ef\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3"+
		"\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f9\3\2\2\2\u06f5\u06f3\3\2"+
		"\2\2\u06f6\u06f8\5x=\2\u06f7\u06f6\3\2\2\2\u06f8\u06fb\3\2\2\2\u06f9\u06f7"+
		"\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fd\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fc"+
		"\u06fe\5r:\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fem\3\2\2\2\u06ff"+
		"\u0700\7k\2\2\u0700\u0701\7\37\2\2\u0701\u0706\5\u00aeX\2\u0702\u0703"+
		"\7\4\2\2\u0703\u0705\5\u00aeX\2\u0704\u0702\3\2\2\2\u0705\u0708\3\2\2"+
		"\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u071a\3\2\2\2\u0708\u0706"+
		"\3\2\2\2\u0709\u070a\7\u0111\2\2\u070a\u071b\7\u00d2\2\2\u070b\u070c\7"+
		"\u0111\2\2\u070c\u071b\78\2\2\u070d\u070e\7l\2\2\u070e\u070f\7\u00e0\2"+
		"\2\u070f\u0710\7\3\2\2\u0710\u0715\5p9\2\u0711\u0712\7\4\2\2\u0712\u0714"+
		"\5p9\2\u0713\u0711\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0715"+
		"\u0716\3\2\2\2\u0716\u0718\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u0719\7\5"+
		"\2\2\u0719\u071b\3\2\2\2\u071a\u0709\3\2\2\2\u071a\u070b\3\2\2\2\u071a"+
		"\u070d\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u072c\3\2\2\2\u071c\u071d\7k"+
		"\2\2\u071d\u071e\7\37\2\2\u071e\u071f\7l\2\2\u071f\u0720\7\u00e0\2\2\u0720"+
		"\u0721\7\3\2\2\u0721\u0726\5p9\2\u0722\u0723\7\4\2\2\u0723\u0725\5p9\2"+
		"\u0724\u0722\3\2\2\2\u0725\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727"+
		"\3\2\2\2\u0727\u0729\3\2\2\2\u0728\u0726\3\2\2\2\u0729\u072a\7\5\2\2\u072a"+
		"\u072c\3\2\2\2\u072b\u06ff\3\2\2\2\u072b\u071c\3\2\2\2\u072co\3\2\2\2"+
		"\u072d\u0736\7\3\2\2\u072e\u0733\5\u00aeX\2\u072f\u0730\7\4\2\2\u0730"+
		"\u0732\5\u00aeX\2\u0731\u072f\3\2\2\2\u0732\u0735\3\2\2\2\u0733\u0731"+
		"\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0736"+
		"\u072e\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u073b\7\5"+
		"\2\2\u0739\u073b\5\u00aeX\2\u073a\u072d\3\2\2\2\u073a\u0739\3\2\2\2\u073b"+
		"q\3\2\2\2\u073c\u073d\7\u00b7\2\2\u073d\u073e\7\3\2\2\u073e\u073f\5\u00a6"+
		"T\2\u073f\u0740\7a\2\2\u0740\u0741\5t;\2\u0741\u0742\7s\2\2\u0742\u0743"+
		"\7\3\2\2\u0743\u0748\5v<\2\u0744\u0745\7\4\2\2\u0745\u0747\5v<\2\u0746"+
		"\u0744\3\2\2\2\u0747\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2"+
		"\2\2\u0749\u074b\3\2\2\2\u074a\u0748\3\2\2\2\u074b\u074c\7\5\2\2\u074c"+
		"\u074d\7\5\2\2\u074ds\3\2\2\2\u074e\u075b\5\u00eex\2\u074f\u0750\7\3\2"+
		"\2\u0750\u0755\5\u00eex\2\u0751\u0752\7\4\2\2\u0752\u0754\5\u00eex\2\u0753"+
		"\u0751\3\2\2\2\u0754\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2"+
		"\2\2\u0756\u0758\3\2\2\2\u0757\u0755\3\2\2\2\u0758\u0759\7\5\2\2\u0759"+
		"\u075b\3\2\2\2\u075a\u074e\3\2\2\2\u075a\u074f\3\2\2\2\u075bu\3\2\2\2"+
		"\u075c\u0761\5\u00aeX\2\u075d\u075f\7\27\2\2\u075e\u075d\3\2\2\2\u075e"+
		"\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0762\5\u00eex\2\u0761\u075e"+
		"\3\2\2\2\u0761\u0762\3\2\2\2\u0762w\3\2\2\2\u0763\u0764\7\u0083\2\2\u0764"+
		"\u0766\7\u010b\2\2\u0765\u0767\7\u00ad\2\2\u0766\u0765\3\2\2\2\u0766\u0767"+
		"\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0769\5\u00e8u\2\u0769\u0772\7\3\2"+
		"\2\u076a\u076f\5\u00aeX\2\u076b\u076c\7\4\2\2\u076c\u076e\5\u00aeX\2\u076d"+
		"\u076b\3\2\2\2\u076e\u0771\3\2\2\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2"+
		"\2\2\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2\2\u0772\u076a\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\7\5\2\2\u0775\u0781\5\u00ee"+
		"x\2\u0776\u0778\7\27\2\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778"+
		"\u0779\3\2\2\2\u0779\u077e\5\u00eex\2\u077a\u077b\7\4\2\2\u077b\u077d"+
		"\5\u00eex\2\u077c\u077a\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2"+
		"\2\u077e\u077f\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0777"+
		"\3\2\2\2\u0781\u0782\3\2\2\2\u0782y\3\2\2\2\u0783\u0784\t\20\2\2\u0784"+
		"{\3\2\2\2\u0785\u0789\5\u0094K\2\u0786\u0788\5~@\2\u0787\u0786\3\2\2\2"+
		"\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a}\3"+
		"\2\2\2\u078b\u0789\3\2\2\2\u078c\u078d\5\u0080A\2\u078d\u078e\7\177\2"+
		"\2\u078e\u0790\5\u0094K\2\u078f\u0791\5\u0082B\2\u0790\u078f\3\2\2\2\u0790"+
		"\u0791\3\2\2\2\u0791\u0798\3\2\2\2\u0792\u0793\7\u00a0\2\2\u0793\u0794"+
		"\5\u0080A\2\u0794\u0795\7\177\2\2\u0795\u0796\5\u0094K\2\u0796\u0798\3"+
		"\2\2\2\u0797\u078c\3\2\2\2\u0797\u0792\3\2\2\2\u0798\177\3\2\2\2\u0799"+
		"\u079b\7v\2\2\u079a\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u07b2\3\2"+
		"\2\2\u079c\u07b2\7\67\2\2\u079d\u079f\7\u0086\2\2\u079e\u07a0\7\u00ad"+
		"\2\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07b2\3\2\2\2\u07a1"+
		"\u07a3\7\u0086\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4"+
		"\3\2\2\2\u07a4\u07b2\7\u00d9\2\2\u07a5\u07a7\7\u00cd\2\2\u07a6\u07a8\7"+
		"\u00ad\2\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07b2\3\2\2\2"+
		"\u07a9\u07ab\7f\2\2\u07aa\u07ac\7\u00ad\2\2\u07ab\u07aa\3\2\2\2\u07ab"+
		"\u07ac\3\2\2\2\u07ac\u07b2\3\2\2\2\u07ad\u07af\7\u0086\2\2\u07ae\u07ad"+
		"\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\7\23\2\2"+
		"\u07b1\u079a\3\2\2\2\u07b1\u079c\3\2\2\2\u07b1\u079d\3\2\2\2\u07b1\u07a2"+
		"\3\2\2\2\u07b1\u07a5\3\2\2\2\u07b1\u07a9\3\2\2\2\u07b1\u07ae\3\2\2\2\u07b2"+
		"\u0081\3\2\2\2\u07b3\u07b4\7\u00a6\2\2\u07b4\u07b8\5\u00b0Y\2\u07b5\u07b6"+
		"\7\u0109\2\2\u07b6\u07b8\5\u0088E\2\u07b7\u07b3\3\2\2\2\u07b7\u07b5\3"+
		"\2\2\2\u07b8\u0083\3\2\2\2\u07b9\u07ba\7\u00ef\2\2\u07ba\u07bc\7\3\2\2"+
		"\u07bb\u07bd\5\u0086D\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd"+
		"\u07be\3\2\2\2\u07be\u07bf\7\5\2\2\u07bf\u0085\3\2\2\2\u07c0\u07c2\7\u011d"+
		"\2\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3"+
		"\u07c4\t\21\2\2\u07c4\u07d9\7\u00b6\2\2\u07c5\u07c6\5\u00aeX\2\u07c6\u07c7"+
		"\7\u00d4\2\2\u07c7\u07d9\3\2\2\2\u07c8\u07c9\7\35\2\2\u07c9\u07ca\7\u012b"+
		"\2\2\u07ca\u07cb\7\u00ac\2\2\u07cb\u07cc\7\u00a5\2\2\u07cc\u07d5\7\u012b"+
		"\2\2\u07cd\u07d3\7\u00a6\2\2\u07ce\u07d4\5\u00eex\2\u07cf\u07d0\5\u00e8"+
		"u\2\u07d0\u07d1\7\3\2\2\u07d1\u07d2\7\5\2\2\u07d2\u07d4\3\2\2\2\u07d3"+
		"\u07ce\3\2\2\2\u07d3\u07cf\3\2\2\2\u07d4\u07d6\3\2\2\2\u07d5\u07cd\3\2"+
		"\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d9\5\u00aeX\2\u07d8"+
		"\u07c1\3\2\2\2\u07d8\u07c5\3\2\2\2\u07d8\u07c8\3\2\2\2\u07d8\u07d7\3\2"+
		"\2\2\u07d9\u0087\3\2\2\2\u07da\u07db\7\3\2\2\u07db\u07dc\5\u008aF\2\u07dc"+
		"\u07dd\7\5\2\2\u07dd\u0089\3\2\2\2\u07de\u07e3\5\u00eav\2\u07df\u07e0"+
		"\7\4\2\2\u07e0\u07e2\5\u00eav\2\u07e1\u07df\3\2\2\2\u07e2\u07e5\3\2\2"+
		"\2\u07e3\u07e1\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u008b\3\2\2\2\u07e5\u07e3"+
		"\3\2\2\2\u07e6\u07e7\7\3\2\2\u07e7\u07ec\5\u008eH\2\u07e8\u07e9\7\4\2"+
		"\2\u07e9\u07eb\5\u008eH\2\u07ea\u07e8\3\2\2\2\u07eb\u07ee\3\2\2\2\u07ec"+
		"\u07ea\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ef\3\2\2\2\u07ee\u07ec\3\2"+
		"\2\2\u07ef\u07f0\7\5\2\2\u07f0\u008d\3\2\2\2\u07f1\u07f3\5\u00eav\2\u07f2"+
		"\u07f4\t\16\2\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u008f\3"+
		"\2\2\2\u07f5\u07f6\7\3\2\2\u07f6\u07fb\5\u0092J\2\u07f7\u07f8\7\4\2\2"+
		"\u07f8\u07fa\5\u0092J\2\u07f9\u07f7\3\2\2\2\u07fa\u07fd\3\2\2\2\u07fb"+
		"\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07fb\3\2"+
		"\2\2\u07fe\u07ff\7\5\2\2\u07ff\u0091\3\2\2\2\u0800\u0803\5\u00eex\2\u0801"+
		"\u0802\7.\2\2\u0802\u0804\7\u0127\2\2\u0803\u0801\3\2\2\2\u0803\u0804"+
		"\3\2\2\2\u0804\u0093\3\2\2\2\u0805\u0807\5\u009eP\2\u0806\u0808\5\u0084"+
		"C\2\u0807\u0806\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\3\2\2\2\u0809"+
		"\u080a\5\u009aN\2\u080a\u081e\3\2\2\2\u080b\u080c\7\3\2\2\u080c\u080d"+
		"\5 \21\2\u080d\u080f\7\5\2\2\u080e\u0810\5\u0084C\2\u080f\u080e\3\2\2"+
		"\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\5\u009aN\2\u0812"+
		"\u081e\3\2\2\2\u0813\u0814\7\3\2\2\u0814\u0815\5|?\2\u0815\u0817\7\5\2"+
		"\2\u0816\u0818\5\u0084C\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u081a\5\u009aN\2\u081a\u081e\3\2\2\2\u081b\u081e"+
		"\5\u0096L\2\u081c\u081e\5\u0098M\2\u081d\u0805\3\2\2\2\u081d\u080b\3\2"+
		"\2\2\u081d\u0813\3\2\2\2\u081d\u081b\3\2\2\2\u081d\u081c\3\2\2\2\u081e"+
		"\u0095\3\2\2\2\u081f\u0820\7\u010a\2\2\u0820\u0825\5\u00aeX\2\u0821\u0822"+
		"\7\4\2\2\u0822\u0824\5\u00aeX\2\u0823\u0821\3\2\2\2\u0824\u0827\3\2\2"+
		"\2\u0825\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0828\3\2\2\2\u0827\u0825"+
		"\3\2\2\2\u0828\u0829\5\u009aN\2\u0829\u0097\3\2\2\2\u082a\u082b\5\u00ea"+
		"v\2\u082b\u0834\7\3\2\2\u082c\u0831\5\u00aeX\2\u082d\u082e\7\4\2\2\u082e"+
		"\u0830\5\u00aeX\2\u082f\u082d\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u082f"+
		"\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0835\3\2\2\2\u0833\u0831\3\2\2\2\u0834"+
		"\u082c\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\7\5"+
		"\2\2\u0837\u0838\5\u009aN\2\u0838\u0099\3\2\2\2\u0839\u083b\7\27\2\2\u083a"+
		"\u0839\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\5\u00f0"+
		"y\2\u083d\u083f\5\u0088E\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f"+
		"\u0841\3\2\2\2\u0840\u083a\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u009b\3\2"+
		"\2\2\u0842\u0843\7\u00d3\2\2\u0843\u0844\7c\2\2\u0844\u0845\7\u00db\2"+
		"\2\u0845\u0849\7\u0127\2\2\u0846\u0847\7\u0111\2\2\u0847\u0848\7\u00dc"+
		"\2\2\u0848\u084a\5\66\34\2\u0849\u0846\3\2\2\2\u0849\u084a\3\2\2\2\u084a"+
		"\u0874\3\2\2\2\u084b\u084c\7\u00d3\2\2\u084c\u084d\7c\2\2\u084d\u0857"+
		"\7F\2\2\u084e\u084f\7\\\2\2\u084f\u0850\7\u00f2\2\2\u0850\u0851\7\37\2"+
		"\2\u0851\u0855\7\u0127\2\2\u0852\u0853\7Q\2\2\u0853\u0854\7\37\2\2\u0854"+
		"\u0856\7\u0127\2\2\u0855\u0852\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858"+
		"\3\2\2\2\u0857\u084e\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u085e\3\2\2\2\u0859"+
		"\u085a\7+\2\2\u085a\u085b\7~\2\2\u085b\u085c\7\u00f2\2\2\u085c\u085d\7"+
		"\37\2\2\u085d\u085f\7\u0127\2\2\u085e\u0859\3\2\2\2\u085e\u085f\3\2\2"+
		"\2\u085f\u0865\3\2\2\2\u0860\u0861\7\u0093\2\2\u0861\u0862\7\u0080\2\2"+
		"\u0862\u0863\7\u00f2\2\2\u0863\u0864\7\37\2\2\u0864\u0866\7\u0127\2\2"+
		"\u0865\u0860\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u086b\3\2\2\2\u0867\u0868"+
		"\7\u0089\2\2\u0868\u0869\7\u00f2\2\2\u0869\u086a\7\37\2\2\u086a\u086c"+
		"\7\u0127\2\2\u086b\u0867\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u0871\3\2\2"+
		"\2\u086d\u086e\7\u00a3\2\2\u086e\u086f\7D\2\2\u086f\u0870\7\27\2\2\u0870"+
		"\u0872\7\u0127\2\2\u0871\u086d\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0874"+
		"\3\2\2\2\u0873\u0842\3\2\2\2\u0873\u084b\3\2\2\2\u0874\u009d\3\2\2\2\u0875"+
		"\u087a\5\u00eav\2\u0876\u0877\7\6\2\2\u0877\u0879\5\u00eav\2\u0878\u0876"+
		"\3\2\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2\2\2\u087b"+
		"\u009f\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u087e\5\u00eav\2\u087e\u087f"+
		"\7\6\2\2\u087f\u0881\3\2\2\2\u0880\u087d\3\2\2\2\u0880\u0881\3\2\2\2\u0881"+
		"\u0882\3\2\2\2\u0882\u0883\5\u00eav\2\u0883\u00a1\3\2\2\2\u0884\u0885"+
		"\5\u00eav\2\u0885\u0886\7\6\2\2\u0886\u0888\3\2\2\2\u0887\u0884\3\2\2"+
		"\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a\5\u00eav\2\u088a"+
		"\u00a3\3\2\2\2\u088b\u0893\5\u00aeX\2\u088c\u088e\7\27\2\2\u088d\u088c"+
		"\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0891\3\2\2\2\u088f\u0892\5\u00eav"+
		"\2\u0890\u0892\5\u0088E\2\u0891\u088f\3\2\2\2\u0891\u0890\3\2\2\2\u0892"+
		"\u0894\3\2\2\2\u0893\u088d\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u00a5\3\2"+
		"\2\2\u0895\u089a\5\u00a4S\2\u0896\u0897\7\4\2\2\u0897\u0899\5\u00a4S\2"+
		"\u0898\u0896\3\2\2\2\u0899\u089c\3\2\2\2\u089a\u0898\3\2\2\2\u089a\u089b"+
		"\3\2\2\2\u089b\u00a7\3\2\2\2\u089c\u089a\3\2\2\2\u089d\u089e\7\3\2\2\u089e"+
		"\u08a3\5\u00aaV\2";
	private static final String _serializedATNSegment1 =
		"\u089f\u08a0\7\4\2\2\u08a0\u08a2\5\u00aaV\2\u08a1\u089f\3\2\2\2\u08a2"+
		"\u08a5\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a6\3\2"+
		"\2\2\u08a5\u08a3\3\2\2\2\u08a6\u08a7\7\5\2\2\u08a7\u00a9\3\2\2\2\u08a8"+
		"\u08b6\5\u00e8u\2\u08a9\u08aa\5\u00eex\2\u08aa\u08ab\7\3\2\2\u08ab\u08b0"+
		"\5\u00acW\2\u08ac\u08ad\7\4\2\2\u08ad\u08af\5\u00acW\2\u08ae\u08ac\3\2"+
		"\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1"+
		"\u08b3\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08b4\7\5\2\2\u08b4\u08b6\3\2"+
		"\2\2\u08b5\u08a8\3\2\2\2\u08b5\u08a9\3\2\2\2\u08b6\u00ab\3\2\2\2\u08b7"+
		"\u08ba\5\u00e8u\2\u08b8\u08ba\5\u00b8]\2\u08b9\u08b7\3\2\2\2\u08b9\u08b8"+
		"\3\2\2\2\u08ba\u00ad\3\2\2\2\u08bb\u08bc\5\u00b0Y\2\u08bc\u00af\3\2\2"+
		"\2\u08bd\u08be\bY\1\2\u08be\u08bf\7\u00a2\2\2\u08bf\u08ca\5\u00b0Y\7\u08c0"+
		"\u08c1\7T\2\2\u08c1\u08c2\7\3\2\2\u08c2\u08c3\5 \21\2\u08c3\u08c4\7\5"+
		"\2\2\u08c4\u08ca\3\2\2\2\u08c5\u08c7\5\u00b4[\2\u08c6\u08c8\5\u00b2Z\2"+
		"\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08ca\3\2\2\2\u08c9\u08bd"+
		"\3\2\2\2\u08c9\u08c0\3\2\2\2\u08c9\u08c5\3\2\2\2\u08ca\u08d3\3\2\2\2\u08cb"+
		"\u08cc\f\4\2\2\u08cc\u08cd\7\22\2\2\u08cd\u08d2\5\u00b0Y\5\u08ce\u08cf"+
		"\f\3\2\2\u08cf\u08d0\7\u00aa\2\2\u08d0\u08d2\5\u00b0Y\4\u08d1\u08cb\3"+
		"\2\2\2\u08d1\u08ce\3\2\2\2\u08d2\u08d5\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d3"+
		"\u08d4\3\2\2\2\u08d4\u00b1\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6\u08d8\7\u00a2"+
		"\2\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9"+
		"\u08da\7\33\2\2\u08da\u08db\5\u00b4[\2\u08db\u08dc\7\22\2\2\u08dc\u08dd"+
		"\5\u00b4[\2\u08dd\u090c\3\2\2\2\u08de\u08e0\7\u00a2\2\2\u08df\u08de\3"+
		"\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\7s\2\2\u08e2"+
		"\u08e3\7\3\2\2\u08e3\u08e8\5\u00aeX\2\u08e4\u08e5\7\4\2\2\u08e5\u08e7"+
		"\5\u00aeX\2\u08e6\u08e4\3\2\2\2\u08e7\u08ea\3\2\2\2\u08e8\u08e6\3\2\2"+
		"\2\u08e8\u08e9\3\2\2\2\u08e9\u08eb\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb\u08ec"+
		"\7\5\2\2\u08ec\u090c\3\2\2\2\u08ed\u08ef\7\u00a2\2\2\u08ee\u08ed\3\2\2"+
		"\2\u08ee\u08ef\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1\7s\2\2\u08f1\u08f2"+
		"\7\3\2\2\u08f2\u08f3\5 \21\2\u08f3\u08f4\7\5\2\2\u08f4\u090c\3\2\2\2\u08f5"+
		"\u08f7\7\u00a2\2\2\u08f6\u08f5\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f8"+
		"\3\2\2\2\u08f8\u08f9\t\22\2\2\u08f9\u090c\5\u00b4[\2\u08fa\u08fc\7}\2"+
		"\2\u08fb\u08fd\7\u00a2\2\2\u08fc\u08fb\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd"+
		"\u08fe\3\2\2\2\u08fe\u090c\7\u00a3\2\2\u08ff\u0901\7}\2\2\u0900\u0902"+
		"\7\u00a2\2\2\u0901\u0900\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0903\3\2\2"+
		"\2\u0903\u090c\t\23\2\2\u0904\u0906\7}\2\2\u0905\u0907\7\u00a2\2\2\u0906"+
		"\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0909\7L"+
		"\2\2\u0909\u090a\7e\2\2\u090a\u090c\5\u00b4[\2\u090b\u08d7\3\2\2\2\u090b"+
		"\u08df\3\2\2\2\u090b\u08ee\3\2\2\2\u090b\u08f6\3\2\2\2\u090b\u08fa\3\2"+
		"\2\2\u090b\u08ff\3\2\2\2\u090b\u0904\3\2\2\2\u090c\u00b3\3\2\2\2\u090d"+
		"\u090e\b[\1\2\u090e\u0912\5\u00b6\\\2\u090f\u0910\t\24\2\2\u0910\u0912"+
		"\5\u00b4[\t\u0911\u090d\3\2\2\2\u0911\u090f\3\2\2\2\u0912\u0928\3\2\2"+
		"\2\u0913\u0914\f\b\2\2\u0914\u0915\t\25\2\2\u0915\u0927\5\u00b4[\t\u0916"+
		"\u0917\f\7\2\2\u0917\u0918\t\26\2\2\u0918\u0927\5\u00b4[\b\u0919\u091a"+
		"\f\6\2\2\u091a\u091b\7\u0123\2\2\u091b\u0927\5\u00b4[\7\u091c\u091d\f"+
		"\5\2\2\u091d\u091e\7\u0126\2\2\u091e\u0927\5\u00b4[\6\u091f\u0920\f\4"+
		"\2\2\u0920\u0921\7\u0124\2\2\u0921\u0927\5\u00b4[\5\u0922\u0923\f\3\2"+
		"\2\u0923\u0924\5\u00ba^\2\u0924\u0925\5\u00b4[\4\u0925\u0927\3\2\2\2\u0926"+
		"\u0913\3\2\2\2\u0926\u0916\3\2\2\2\u0926\u0919\3\2\2\2\u0926\u091c\3\2"+
		"\2\2\u0926\u091f\3\2\2\2\u0926\u0922\3\2\2\2\u0927\u092a\3\2\2\2\u0928"+
		"\u0926\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u00b5\3\2\2\2\u092a\u0928\3\2"+
		"\2\2\u092b\u092c\b\\\1\2\u092c\u09da\t\27\2\2\u092d\u092f\7\"\2\2\u092e"+
		"\u0930\5\u00dan\2\u092f\u092e\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u092f"+
		"\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0935\3\2\2\2\u0933\u0934\7O\2\2\u0934"+
		"\u0936\5\u00aeX\2\u0935\u0933\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937"+
		"\3\2\2\2\u0937\u0938\7P\2\2\u0938\u09da\3\2\2\2\u0939\u093a\7\"\2\2\u093a"+
		"\u093c\5\u00aeX\2\u093b\u093d\5\u00dan\2\u093c\u093b\3\2\2\2\u093d\u093e"+
		"\3\2\2\2\u093e\u093c\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0942\3\2\2\2\u0940"+
		"\u0941\7O\2\2\u0941\u0943\5\u00aeX\2\u0942\u0940\3\2\2\2\u0942\u0943\3"+
		"\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945\7P\2\2\u0945\u09da\3\2\2\2\u0946"+
		"\u0947\7#\2\2\u0947\u0948\7\3\2\2\u0948\u0949\5\u00aeX\2\u0949\u094a\7"+
		"\27\2\2\u094a\u094b\5\u00ccg\2\u094b\u094c\7\5\2\2\u094c\u09da\3\2\2\2"+
		"\u094d\u094e\7\u00ea\2\2\u094e\u0957\7\3\2\2\u094f\u0954\5\u00a4S\2\u0950"+
		"\u0951\7\4\2\2\u0951\u0953\5\u00a4S\2\u0952\u0950\3\2\2\2\u0953\u0956"+
		"\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0958\3\2\2\2\u0956"+
		"\u0954\3\2\2\2\u0957\u094f\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3\2"+
		"\2\2\u0959\u09da\7\5\2\2\u095a\u095b\t\30\2\2\u095b\u095c\7\3\2\2\u095c"+
		"\u095f\5\u00aeX\2\u095d\u095e\t\31\2\2\u095e\u0960\7\u00a4\2\2\u095f\u095d"+
		"\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0962\7\5\2\2\u0962"+
		"\u09da\3\2\2\2\u0963\u0964\t\32\2\2\u0964\u0965\7\3\2\2\u0965\u0968\5"+
		"\u00aeX\2\u0966\u0967\t\31\2\2\u0967\u0969\7\u00a4\2\2\u0968\u0966\3\2"+
		"\2\2\u0968\u0969\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096b\7\5\2\2\u096b"+
		"\u09da\3\2\2\2\u096c\u096d\7\u00b9\2\2\u096d\u096e\7\3\2\2\u096e\u096f"+
		"\5\u00b4[\2\u096f\u0970\7s\2\2\u0970\u0971\5\u00b4[\2\u0971\u0972\7\5"+
		"\2\2\u0972\u09da\3\2\2\2\u0973\u09da\5\u00b8]\2\u0974\u09da\7\u011e\2"+
		"\2\u0975\u0976\5\u00e8u\2\u0976\u0977\7\6\2\2\u0977\u0978\7\u011e\2\2"+
		"\u0978\u09da\3\2\2\2\u0979\u097a\7\3\2\2\u097a\u097d\5\u00a4S\2\u097b"+
		"\u097c\7\4\2\2\u097c\u097e\5\u00a4S\2\u097d\u097b\3\2\2\2\u097e\u097f"+
		"\3\2\2\2\u097f\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981"+
		"\u0982\7\5\2\2\u0982\u09da\3\2\2\2\u0983\u0984\7\3\2\2\u0984\u0985\5 "+
		"\21\2\u0985\u0986\7\5\2\2\u0986\u09da\3\2\2\2\u0987\u0988\5\u00e8u\2\u0988"+
		"\u0994\7\3\2\2\u0989\u098b\5z>\2\u098a\u0989\3\2\2\2\u098a\u098b\3\2\2"+
		"\2\u098b\u098c\3\2\2\2\u098c\u0991\5\u00aeX\2\u098d\u098e\7\4\2\2\u098e"+
		"\u0990\5\u00aeX\2\u098f\u098d\3\2\2\2\u0990\u0993\3\2\2\2\u0991\u098f"+
		"\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0995\3\2\2\2\u0993\u0991\3\2\2\2\u0994"+
		"\u098a\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0999\7\5"+
		"\2\2\u0997\u0998\7\u00af\2\2\u0998\u099a\5\u00e0q\2\u0999\u0997\3\2\2"+
		"\2\u0999\u099a\3\2\2\2\u099a\u09da\3\2\2\2\u099b\u099c\7\u012f\2\2\u099c"+
		"\u099d\7\t\2\2\u099d\u09da\5\u00aeX\2\u099e\u099f\7\3\2\2\u099f\u09a2"+
		"\7\u012f\2\2\u09a0\u09a1\7\4\2\2\u09a1\u09a3\7\u012f\2\2\u09a2\u09a0\3"+
		"\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a2\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5"+
		"\u09a6\3\2\2\2\u09a6\u09a7\7\5\2\2\u09a7\u09a8\7\t\2\2\u09a8\u09da\5\u00ae"+
		"X\2\u09a9\u09da\5\u00eex\2\u09aa\u09ab\7\3\2\2\u09ab\u09ac\5\u00aeX\2"+
		"\u09ac\u09ad\7\5\2\2\u09ad\u09da\3\2\2\2\u09ae\u09af\7Y\2\2\u09af\u09b0"+
		"\7\3\2\2\u09b0\u09b1\5\u00eex\2\u09b1\u09b2\7e\2\2\u09b2\u09b3\5\u00b4"+
		"[\2\u09b3\u09b4\7\5\2\2\u09b4\u09da\3\2\2\2\u09b5\u09b6\t\33\2\2\u09b6"+
		"\u09b7\7\3\2\2\u09b7\u09b8\5\u00b4[\2\u09b8\u09b9\t\34\2\2\u09b9\u09bc"+
		"\5\u00b4[\2\u09ba\u09bb\t\35\2\2\u09bb\u09bd\5\u00b4[\2\u09bc\u09ba\3"+
		"\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u09bf\7\5\2\2\u09bf"+
		"\u09da\3\2\2\2\u09c0\u09c1\7\u00fa\2\2\u09c1\u09c3\7\3\2\2\u09c2\u09c4"+
		"\t\36\2\2\u09c3\u09c2\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c6\3\2\2\2"+
		"\u09c5\u09c7\5\u00b4[\2\u09c6\u09c5\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7"+
		"\u09c8\3\2\2\2\u09c8\u09c9\7e\2\2\u09c9\u09ca\5\u00b4[\2\u09ca\u09cb\7"+
		"\5\2\2\u09cb\u09da\3\2\2\2\u09cc\u09cd\7\u00b1\2\2\u09cd\u09ce\7\3\2\2"+
		"\u09ce\u09cf\5\u00b4[\2\u09cf\u09d0\7\u00b8\2\2\u09d0\u09d1\5\u00b4[\2"+
		"\u09d1\u09d2\7e\2\2\u09d2\u09d5\5\u00b4[\2\u09d3\u09d4\7a\2\2\u09d4\u09d6"+
		"\5\u00b4[\2\u09d5\u09d3\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09d7\3\2\2"+
		"\2\u09d7\u09d8\7\5\2\2\u09d8\u09da\3\2\2\2\u09d9\u092b\3\2\2\2\u09d9\u092d"+
		"\3\2\2\2\u09d9\u0939\3\2\2\2\u09d9\u0946\3\2\2\2\u09d9\u094d\3\2\2\2\u09d9"+
		"\u095a\3\2\2\2\u09d9\u0963\3\2\2\2\u09d9\u096c\3\2\2\2\u09d9\u0973\3\2"+
		"\2\2\u09d9\u0974\3\2\2\2\u09d9\u0975\3\2\2\2\u09d9\u0979\3\2\2\2\u09d9"+
		"\u0983\3\2\2\2\u09d9\u0987\3\2\2\2\u09d9\u099b\3\2\2\2\u09d9\u099e\3\2"+
		"\2\2\u09d9\u09a9\3\2\2\2\u09d9\u09aa\3\2\2\2\u09d9\u09ae\3\2\2\2\u09d9"+
		"\u09b5\3\2\2\2\u09d9\u09c0\3\2\2\2\u09d9\u09cc\3\2\2\2\u09da\u09e5\3\2"+
		"\2\2\u09db\u09dc\f\n\2\2\u09dc\u09dd\7\n\2\2\u09dd\u09de\5\u00b4[\2\u09de"+
		"\u09df\7\13\2\2\u09df\u09e4\3\2\2\2\u09e0\u09e1\f\b\2\2\u09e1\u09e2\7"+
		"\6\2\2\u09e2\u09e4\5\u00eex\2\u09e3\u09db\3\2\2\2\u09e3\u09e0\3\2\2\2"+
		"\u09e4\u09e7\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u00b7"+
		"\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e8\u09f5\7\u00a3\2\2\u09e9\u09f5\5\u00c2"+
		"b\2\u09ea\u09eb\5\u00eex\2\u09eb\u09ec\7\u0127\2\2\u09ec\u09f5\3\2\2\2"+
		"\u09ed\u09f5\5\u00f4{\2\u09ee\u09f5\5\u00c0a\2\u09ef\u09f1\7\u0127\2\2"+
		"\u09f0\u09ef\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f2\u09f3"+
		"\3\2\2\2\u09f3\u09f5\3\2\2\2\u09f4\u09e8\3\2\2\2\u09f4\u09e9\3\2\2\2\u09f4"+
		"\u09ea\3\2\2\2\u09f4\u09ed\3\2\2\2\u09f4\u09ee\3\2\2\2\u09f4\u09f0\3\2"+
		"\2\2\u09f5\u00b9\3\2\2\2\u09f6\u09f7\t\37\2\2\u09f7\u00bb\3\2\2\2\u09f8"+
		"\u09f9\t \2\2\u09f9\u00bd\3\2\2\2\u09fa\u09fb\t!\2\2\u09fb\u00bf\3\2\2"+
		"\2\u09fc\u09fd\t\"\2\2\u09fd\u00c1\3\2\2\2\u09fe\u0a00\6b\22\2\u09ff\u0a01"+
		"\7{\2\2\u0a00\u09ff\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0a03\3\2\2\2\u0a02"+
		"\u0a04\5\u00c4c\2\u0a03\u0a02\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a03"+
		"\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06\u0a10\3\2\2\2\u0a07\u0a08\6b\23\2\u0a08"+
		"\u0a0c\7{\2\2\u0a09\u0a0b\5\u00c4c\2\u0a0a\u0a09\3\2\2\2\u0a0b\u0a0e\3"+
		"\2\2\2\u0a0c\u0a0a\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a10\3\2\2\2\u0a0e"+
		"\u0a0c\3\2\2\2\u0a0f\u09fe\3\2\2\2\u0a0f\u0a07\3\2\2\2\u0a10\u00c3\3\2"+
		"\2\2\u0a11\u0a12\5\u00c6d\2\u0a12\u0a15\5\u00c8e\2\u0a13\u0a14\7\u00f4"+
		"\2\2\u0a14\u0a16\5\u00c8e\2\u0a15\u0a13\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16"+
		"\u00c5\3\2\2\2\u0a17\u0a19\t#\2\2\u0a18\u0a17\3\2\2\2\u0a18\u0a19\3\2"+
		"\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1d\t\21\2\2\u0a1b\u0a1d\7\u0127\2\2"+
		"\u0a1c\u0a18\3\2\2\2\u0a1c\u0a1b\3\2\2\2\u0a1d\u00c7\3\2\2\2\u0a1e\u0a1f"+
		"\t$\2\2\u0a1f\u00c9\3\2\2\2\u0a20\u0a24\7^\2\2\u0a21\u0a22\7\16\2\2\u0a22"+
		"\u0a24\5\u00e8u\2\u0a23\u0a20\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a24\u00cb"+
		"\3\2\2\2\u0a25\u0a26\7\26\2\2\u0a26\u0a27\7\u0118\2\2\u0a27\u0a28\5\u00cc"+
		"g\2\u0a28\u0a29\7\u011a\2\2\u0a29\u0a48\3\2\2\2\u0a2a\u0a2b\7\u0093\2"+
		"\2\u0a2b\u0a2c\7\u0118\2\2\u0a2c\u0a2d\5\u00ccg\2\u0a2d\u0a2e\7\4\2\2"+
		"\u0a2e\u0a2f\5\u00ccg\2\u0a2f\u0a30\7\u011a\2\2\u0a30\u0a48\3\2\2\2\u0a31"+
		"\u0a38\7\u00ea\2\2\u0a32\u0a34\7\u0118\2\2\u0a33\u0a35\5\u00d6l\2\u0a34"+
		"\u0a33\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a39\7\u011a"+
		"\2\2\u0a37\u0a39\7\u0116\2\2\u0a38\u0a32\3\2\2\2\u0a38\u0a37\3\2\2\2\u0a39"+
		"\u0a48\3\2\2\2\u0a3a\u0a45\5\u00eex\2\u0a3b\u0a3c\7\3\2\2\u0a3c\u0a41"+
		"\7\u012b\2\2\u0a3d\u0a3e\7\4\2\2\u0a3e\u0a40\7\u012b\2\2\u0a3f\u0a3d\3"+
		"\2\2\2\u0a40\u0a43\3\2\2\2\u0a41\u0a3f\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42"+
		"\u0a44\3\2\2\2\u0a43\u0a41\3\2\2\2\u0a44\u0a46\7\5\2\2\u0a45\u0a3b\3\2"+
		"\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a48\3\2\2\2\u0a47\u0a25\3\2\2\2\u0a47"+
		"\u0a2a\3\2\2\2\u0a47\u0a31\3\2\2\2\u0a47\u0a3a\3\2\2\2\u0a48\u00cd\3\2"+
		"\2\2\u0a49\u0a4e\5\u00d0i\2\u0a4a\u0a4b\7\4\2\2\u0a4b\u0a4d\5\u00d0i\2"+
		"\u0a4c\u0a4a\3\2\2\2\u0a4d\u0a50\3\2\2\2\u0a4e\u0a4c\3\2\2\2\u0a4e\u0a4f"+
		"\3\2\2\2\u0a4f\u00cf\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a51\u0a52\5\u00e8u"+
		"\2\u0a52\u0a55\5\u00ccg\2\u0a53\u0a54\7.\2\2\u0a54\u0a56\7\u0127\2\2\u0a55"+
		"\u0a53\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a58\3\2\2\2\u0a57\u0a59\5\u00ca"+
		"f\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u00d1\3\2\2\2\u0a5a"+
		"\u0a5f\5\u00d4k\2\u0a5b\u0a5c\7\4\2\2\u0a5c\u0a5e\5\u00d4k\2\u0a5d\u0a5b"+
		"\3\2\2\2\u0a5e\u0a61\3\2\2\2\u0a5f\u0a5d\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60"+
		"\u00d3\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a62\u0a63\5\u00eav\2\u0a63\u0a66"+
		"\5\u00ccg\2\u0a64\u0a65\7.\2\2\u0a65\u0a67\7\u0127\2\2\u0a66\u0a64\3\2"+
		"\2\2\u0a66\u0a67\3\2\2\2\u0a67\u00d5\3\2\2\2\u0a68\u0a6d\5\u00d8m\2\u0a69"+
		"\u0a6a\7\4\2\2\u0a6a\u0a6c\5\u00d8m\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6f"+
		"\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u00d7\3\2\2\2\u0a6f"+
		"\u0a6d\3\2\2\2\u0a70\u0a71\5\u00eex\2\u0a71\u0a72\7\f\2\2\u0a72\u0a75"+
		"\5\u00ccg\2\u0a73\u0a74\7.\2\2\u0a74\u0a76\7\u0127\2\2\u0a75\u0a73\3\2"+
		"\2\2\u0a75\u0a76\3\2\2\2\u0a76\u00d9\3\2\2\2\u0a77\u0a78\7\u010e\2\2\u0a78"+
		"\u0a79\5\u00aeX\2\u0a79\u0a7a\7\u00f3\2\2\u0a7a\u0a7b\5\u00aeX\2\u0a7b"+
		"\u00db\3\2\2\2\u0a7c\u0a7d\7\u0110\2\2\u0a7d\u0a82\5\u00dep\2\u0a7e\u0a7f"+
		"\7\4\2\2\u0a7f\u0a81\5\u00dep\2\u0a80\u0a7e\3\2\2\2\u0a81\u0a84\3\2\2"+
		"\2\u0a82\u0a80\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u00dd\3\2\2\2\u0a84\u0a82"+
		"\3\2\2\2\u0a85\u0a86\5\u00eav\2\u0a86\u0a87\7\27\2\2\u0a87\u0a88\5\u00e0"+
		"q\2\u0a88\u00df\3\2\2\2\u0a89\u0ab8\5\u00eav\2\u0a8a\u0a8b\7\3\2\2\u0a8b"+
		"\u0a8c\5\u00eav\2\u0a8c\u0a8d\7\5\2\2\u0a8d\u0ab8\3\2\2\2\u0a8e\u0ab1"+
		"\7\3\2\2\u0a8f\u0a90\7\'\2\2\u0a90\u0a91\7\37\2\2\u0a91\u0a96\5\u00ae"+
		"X\2\u0a92\u0a93\7\4\2\2\u0a93\u0a95\5\u00aeX\2\u0a94\u0a92\3\2\2\2\u0a95"+
		"\u0a98\3\2\2\2\u0a96\u0a94\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0ab2\3\2"+
		"\2\2\u0a98\u0a96\3\2\2\2\u0a99\u0a9a\t%\2\2\u0a9a\u0a9b\7\37\2\2\u0a9b"+
		"\u0aa0\5\u00aeX\2\u0a9c\u0a9d\7\4\2\2\u0a9d\u0a9f\5\u00aeX\2\u0a9e\u0a9c"+
		"\3\2\2\2\u0a9f\u0aa2\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1"+
		"\u0aa4\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa3\u0a99\3\2\2\2\u0aa3\u0aa4\3\2"+
		"\2\2\u0aa4\u0aaf\3\2\2\2\u0aa5\u0aa6\t&\2\2\u0aa6\u0aa7\7\37\2\2\u0aa7"+
		"\u0aac\5T+\2\u0aa8\u0aa9\7\4\2\2\u0aa9\u0aab\5T+\2\u0aaa\u0aa8\3\2\2\2"+
		"\u0aab\u0aae\3\2\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0ab0"+
		"\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aaf\u0aa5\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0"+
		"\u0ab2\3\2\2\2\u0ab1\u0a8f\3\2\2\2\u0ab1\u0aa3\3\2\2\2\u0ab2\u0ab4\3\2"+
		"\2\2\u0ab3\u0ab5\5\u00e2r\2\u0ab4\u0ab3\3\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5"+
		"\u0ab6\3\2\2\2\u0ab6\u0ab8\7\5\2\2\u0ab7\u0a89\3\2\2\2\u0ab7\u0a8a\3\2"+
		"\2\2\u0ab7\u0a8e\3\2\2\2\u0ab8\u00e1\3\2\2\2\u0ab9\u0aba\7\u00bf\2\2\u0aba"+
		"\u0aca\5\u00e4s\2\u0abb\u0abc\7\u00d4\2\2\u0abc\u0aca\5\u00e4s\2\u0abd"+
		"\u0abe\7\u00bf\2\2\u0abe\u0abf\7\33\2\2\u0abf\u0ac0\5\u00e4s\2\u0ac0\u0ac1"+
		"\7\22\2\2\u0ac1\u0ac2\5\u00e4s\2\u0ac2\u0aca\3\2\2\2\u0ac3\u0ac4\7\u00d4"+
		"\2\2\u0ac4\u0ac5\7\33\2\2\u0ac5\u0ac6\5\u00e4s\2\u0ac6\u0ac7\7\22\2\2"+
		"\u0ac7\u0ac8\5\u00e4s\2\u0ac8\u0aca\3\2\2\2\u0ac9\u0ab9\3\2\2\2\u0ac9"+
		"\u0abb\3\2\2\2\u0ac9\u0abd\3\2\2\2\u0ac9\u0ac3\3\2\2\2\u0aca\u00e3\3\2"+
		"\2\2\u0acb\u0acc\7\u00ff\2\2\u0acc\u0ad3\t\'\2\2\u0acd\u0ace\79\2\2\u0ace"+
		"\u0ad3\7\u00d3\2\2\u0acf\u0ad0\5\u00aeX\2\u0ad0\u0ad1\t\'\2\2\u0ad1\u0ad3"+
		"\3\2\2\2\u0ad2\u0acb\3\2\2\2\u0ad2\u0acd\3\2\2\2\u0ad2\u0acf\3\2\2\2\u0ad3"+
		"\u00e5\3\2\2\2\u0ad4\u0ad9\5\u00e8u\2\u0ad5\u0ad6\7\4\2\2\u0ad6\u0ad8"+
		"\5\u00e8u\2\u0ad7\u0ad5\3\2\2\2\u0ad8\u0adb\3\2\2\2\u0ad9\u0ad7\3\2\2"+
		"\2\u0ad9\u0ada\3\2\2\2\u0ada\u00e7\3\2\2\2\u0adb\u0ad9\3\2\2\2\u0adc\u0ae1"+
		"\5\u00eex\2\u0add\u0ade\7\6\2\2\u0ade\u0ae0\5\u00eex\2\u0adf\u0add\3\2"+
		"\2\2\u0ae0\u0ae3\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2"+
		"\u00e9\3\2\2\2\u0ae3\u0ae1\3\2\2\2\u0ae4\u0ae5\5\u00eex\2\u0ae5\u0ae6"+
		"\5\u00ecw\2\u0ae6\u00eb\3\2\2\2\u0ae7\u0ae8\7\u011d\2\2\u0ae8\u0aea\5"+
		"\u00eex\2\u0ae9\u0ae7\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0ae9\3\2\2\2"+
		"\u0aeb\u0aec\3\2\2\2\u0aec\u0aef\3\2\2\2\u0aed\u0aef\3\2\2\2\u0aee\u0ae9"+
		"\3\2\2\2\u0aee\u0aed\3\2\2\2\u0aef\u00ed\3\2\2\2\u0af0\u0af4\5\u00f0y"+
		"\2\u0af1\u0af2\6x\24\2\u0af2\u0af4\5\u00f8}\2\u0af3\u0af0\3\2\2\2\u0af3"+
		"\u0af1\3\2\2\2\u0af4\u00ef\3\2\2\2\u0af5\u0afc\7\u012f\2\2\u0af6\u0afc"+
		"\5\u00f2z\2\u0af7\u0af8\6y\25\2\u0af8\u0afc\5\u00f6|\2\u0af9\u0afa\6y"+
		"\26\2\u0afa\u0afc\5\u00fa~\2\u0afb\u0af5\3\2\2\2\u0afb\u0af6\3\2\2\2\u0afb"+
		"\u0af7\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc\u00f1\3\2\2\2\u0afd\u0afe\7\u0130"+
		"\2\2\u0afe\u00f3\3\2\2\2\u0aff\u0b01\7\u011d\2\2\u0b00\u0aff\3\2\2\2\u0b00"+
		"\u0b01\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b1c\7\u012c\2\2\u0b03\u0b05"+
		"\7\u011d\2\2\u0b04\u0b03\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05\u0b06\3\2\2"+
		"\2\u0b06\u0b1c\7\u012b\2\2\u0b07\u0b09\7\u011d\2\2\u0b08\u0b07\3\2\2\2"+
		"\u0b08\u0b09\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u0b1c\7\u0128\2\2\u0b0b"+
		"\u0b0d\7\u011d\2\2\u0b0c\u0b0b\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b0e"+
		"\3\2\2\2\u0b0e\u0b1c\7\u0129\2\2\u0b0f\u0b11\7\u011d\2\2\u0b10\u0b0f\3"+
		"\2\2\2\u0b10\u0b11\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b1c\7\u012a\2\2"+
		"\u0b13\u0b15\7\u011d\2\2\u0b14\u0b13\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15"+
		"\u0b16\3\2\2\2\u0b16\u0b1c\7\u012d\2\2\u0b17\u0b19\7\u011d\2\2\u0b18\u0b17"+
		"\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b1c\7\u012e\2"+
		"\2\u0b1b\u0b00\3\2\2\2\u0b1b\u0b04\3\2\2\2\u0b1b\u0b08\3\2\2\2\u0b1b\u0b0c"+
		"\3\2\2\2\u0b1b\u0b10\3\2\2\2\u0b1b\u0b14\3\2\2\2\u0b1b\u0b18\3\2\2\2\u0b1c"+
		"\u00f5\3\2\2\2\u0b1d\u0b1e\t(\2\2\u0b1e\u00f7\3\2\2\2\u0b1f\u0b20\t)\2"+
		"\2\u0b20\u00f9\3\2\2\2\u0b21\u0b22\t*\2\2\u0b22\u00fb\3\2\2\2\u017a\u0113"+
		"\u0116\u011c\u0125\u012d\u012f\u0133\u0137\u013c\u0144\u014d\u014f\u0163"+
		"\u0167\u016c\u016f\u0175\u0178\u017b\u0182\u0190\u0192\u0196\u0199\u01a0"+
		"\u01ad\u01b6\u01b8\u01bc\u01bf\u01c6\u01cc\u01d3\u01e1\u01e3\u01e7\u01ea"+
		"\u01f0\u01fb\u023b\u0244\u0249\u024d\u0250\u0256\u025a\u025f\u0265\u026d"+
		"\u0273\u0280\u0285\u028e\u0293\u02a3\u02aa\u02ae\u02b6\u02bd\u02d7\u02db"+
		"\u02e1\u02e7\u02ea\u02ed\u02f3\u02f7\u0300\u0302\u030b\u030e\u0317\u031c"+
		"\u0322\u0329\u032c\u0332\u033d\u0340\u0344\u0349\u034e\u0355\u0358\u035b"+
		"\u0362\u0367\u0370\u0378\u037e\u0382\u0386\u038a\u038c\u0395\u039b\u03a1"+
		"\u03a4\u03a8\u03ab\u03af\u03ba\u03bd\u03c1\u03c7\u03ca\u03cd\u03d3\u03db"+
		"\u03e0\u03e6\u03ec\u03f7\u03ff\u0406\u040f\u0416\u041c\u041f\u0427\u042b"+
		"\u0432\u04a6\u04ae\u04b6\u04bf\u04cb\u04cf\u04d2\u04d8\u04de\u04ea\u04f6"+
		"\u04fb\u0501\u0509\u0510\u0512\u0517\u051b\u0520\u0525\u052a\u052d\u0532"+
		"\u0536\u053b\u053d\u0541\u054a\u0552\u055b\u0562\u056b\u0570\u0573\u0582"+
		"\u0589\u058c\u0593\u0597\u059d\u05a5\u05b0\u05bb\u05c2\u05c8\u05d5\u05d7"+
		"\u05e0\u05e3\u05ec\u05ef\u05f8\u05fb\u0604\u0607\u060a\u060f\u0611\u061d"+
		"\u0624\u062b\u062e\u0630\u063c\u0640\u0644\u064a\u064e\u0656\u065a\u065d"+
		"\u0660\u0663\u0667\u066b\u066e\u0672\u0677\u067b\u067e\u0681\u0684\u0686"+
		"\u0692\u0695\u0699\u06a3\u06a7\u06a9\u06ac\u06b0\u06b6\u06ba\u06c4\u06d4"+
		"\u06d9\u06e6\u06eb\u06f3\u06f9\u06fd\u0706\u0715\u071a\u0726\u072b\u0733"+
		"\u0736\u073a\u0748\u0755\u075a\u075e\u0761\u0766\u076f\u0772\u0777\u077e"+
		"\u0781\u0789\u0790\u0797\u079a\u079f\u07a2\u07a7\u07ab\u07ae\u07b1\u07b7"+
		"\u07bc\u07c1\u07d3\u07d5\u07d8\u07e3\u07ec\u07f3\u07fb\u0803\u0807\u080f"+
		"\u0817\u081d\u0825\u0831\u0834\u083a\u083e\u0840\u0849\u0855\u0857\u085e"+
		"\u0865\u086b\u0871\u0873\u087a\u0880\u0887\u088d\u0891\u0893\u089a\u08a3"+
		"\u08b0\u08b5\u08b9\u08c7\u08c9\u08d1\u08d3\u08d7\u08df\u08e8\u08ee\u08f6"+
		"\u08fc\u0901\u0906\u090b\u0911\u0926\u0928\u0931\u0935\u093e\u0942\u0954"+
		"\u0957\u095f\u0968\u097f\u098a\u0991\u0994\u0999\u09a4\u09bc\u09c3\u09c6"+
		"\u09d5\u09d9\u09e3\u09e5\u09f2\u09f4\u0a00\u0a05\u0a0c\u0a0f\u0a15\u0a18"+
		"\u0a1c\u0a23\u0a34\u0a38\u0a41\u0a45\u0a47\u0a4e\u0a55\u0a58\u0a5f\u0a66"+
		"\u0a6d\u0a75\u0a82\u0a96\u0aa0\u0aa3\u0aac\u0aaf\u0ab1\u0ab4\u0ab7\u0ac9"+
		"\u0ad2\u0ad9\u0ae1\u0aeb\u0aee\u0af3\u0afb\u0b00\u0b04\u0b08\u0b0c\u0b10"+
		"\u0b14\u0b18\u0b1b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}