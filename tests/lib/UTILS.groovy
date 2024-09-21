// Function to remove Nextflow version from software_versions.yml

class UTILS {
    public static Object removeNextflowVersion(outputDir) {
        def softwareVersions = path("$outputDir/pipeline_info/nf_core_pipeline_software_mqc_versions.yml").yaml
        if (softwareVersions.containsKey("Workflow")) {
            softwareVersions.Workflow.remove("Nextflow")
        }
        return softwareVersions
    }
}
