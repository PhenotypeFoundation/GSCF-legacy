package dbnp.studycapturing

/**
 * This class describes an Assay, which describes the application of a certain (omics) measurement to multiple samples.
 * The actual data of these measurements are described in submodules of dbNP. The type property describes in which module
 * this data can be found.
 */
class Assay {
	String name
	AssayModule module
	long externalAssayID // the assay ID the assay has in the external module

	static belongsTo = [parent: Study]

	static hasMany = [samples: Sample]

	static constraints = {
		externalAssayID(unique: true)
	}

	def String toString() {
		return name;
	}
}
